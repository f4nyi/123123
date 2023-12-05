package com.example.project_springboot2.Cli;

import grpc.chat.ChatClassifyGrpc;
import grpc.chat.ChatReply;
import grpc.chat.ChatRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ChatClient {
    private static final Logger logger = Logger.getLogger(ChatClient.class.getName());
    private final ManagedChannel channel;
    private final ChatClassifyGrpc.ChatClassifyBlockingStub blockingStub;

    /**
     * Construct client connecting to HelloWorld server at {@code host:port}.
     */
    public ChatClient(String host, int port) {

        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        blockingStub = ChatClassifyGrpc.newBlockingStub(channel);
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting.
     */
    public static void main(String[] args) throws Exception {
        ChatClient client = new ChatClient("localhost", 50052);
        try {
            String history = "";
            String question = "";
            if (args.length > 0) {
                history = args[0];
                question = args[0];
            }
            client.greet(history, question);
        } finally {
            client.shutdown();
        }
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    /**
     * Say hello to server.
     */
    public Map greet(String history, String question) {
        logger.info("History is： " + history + " ...");
        logger.info("Now your new question is： " + question + " ...");
        ChatRequest request = ChatRequest.newBuilder()
                .setHistory(history)
                .setQuestion(question)
                .build();
        ChatReply response;
        try {
            System.out.println(request);
            response = blockingStub.chatClassify(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return null;
        }
        Map params = new HashMap();
        params.put("Answner", response.getAnswer());
        System.out.println(params);
        return params;
    }
}