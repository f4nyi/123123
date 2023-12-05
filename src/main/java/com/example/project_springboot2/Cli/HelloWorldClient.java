package com.example.project_springboot2.Cli;

import grpc.chat.ChatClassifyGrpc;
import grpc.model.UrlClassifyGrpc;
import grpc.model.UrlReply;
import grpc.model.UrlRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;



public class HelloWorldClient {
    private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());
    private final ManagedChannel channel;
    private final UrlClassifyGrpc.UrlClassifyBlockingStub blockingStub;

    /**
     * Construct client connecting to HelloWorld server at {@code host:port}.
     */
    public HelloWorldClient(String host, int port) {

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = UrlClassifyGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * Say hello to server.
     */
    public Map greet(String url) {
        logger.info("Will try to greet " + url + " ...");
        UrlRequest request = UrlRequest.newBuilder()
                .setUrl(url)
                .build();
        UrlReply response;
        try {
            response = blockingStub.urlClassify(request);
            System.out.println(response);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
        Map params=new HashMap();
        params.put("Stat",response.getStat()          );
        params.put("Svm",response.getSvm()            );
//        params.put("Rf",response.getRf()             );
//        params.put("Ab",response.getAb()             );
//        params.put("Ncm",response.getNcm()            );
//        params.put("Dt",response.getDt()             );
//        params.put("Gbd",response.getGbd()            );
        params.put("ImgNum",response.getImgNum()         );
        params.put("DomainInNum",response.getDomainInNum()    );
        params.put("DomainOutNum",response.getDomainOutNum()   );
        params.put("DomainInNum1",response.getDomainInNum1()   );
        params.put("DomainOutNum1",response.getDomainOutNum1()  );
        params.put("IframeNum",response.getIframeNum()      );
        params.put("MetaNum",response.getMetaNum()        );
        params.put("EmbedNum",response.getEmbedNum()       );
        params.put("ObjectNum",response.getObjectNum()      );
        params.put("ScriptNum",response.getScriptNum()      );
        params.put("EvalNum",response.getEvalNum()        );
        params.put("SetTimeoutNum",response.getSetTimeoutNum()  );
        params.put("SetIntervalNum",response.getSetIntervalNum() );
        params.put("LocationNum",response.getLocationNum()    );
        params.put("OpenNum",response.getOpenNum()        );
        params.put("SrcNum",response.getSrcNum()         );
        params.put("SetAttributeNum",response.getSetAttributeNum());
        params.put("InnerHTMLNum",response.getInnerHTMLNum()   );
        params.put("WhoisInfo",response.getWhoisInfo()      );
        params.put("Register",response.getRegister ()      );
        params.put("UpdatedDate",response.getUpdatedDate()    );
        params.put("CreationDate",response.getCreationDate()   );
        params.put("Email",response.getEmail()          );
        return params;
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        HelloWorldClient client = new HelloWorldClient("8.130.80.4", 50051);
        try {
            String user = "www.baidu.com";
            if (args.length > 0) {
                user = args[0];
            }
            client.greet(user);
        } finally {
            client.shutdown();
        }
    }
}