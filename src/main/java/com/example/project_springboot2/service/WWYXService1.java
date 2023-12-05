package com.example.project_springboot2.service;

import com.example.project_springboot2.Cli.ChatClient;
import com.example.project_springboot2.Cli.OkHttpCli;
import com.example.project_springboot2.dao.ChatDao;
import com.example.project_springboot2.pojo.Chat;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class WWYXService1 {
    public static final String API_KEY = "6521PmCXVvOyaF1a4blNUarR";
    public static final String SECRET_KEY = "COmdyswfjMXtU2OuEgpjfvpW5F0GO6ep";
    public String Access_Token = null;
    @Autowired
    OkHttpCli okHttpCli;

    @Autowired
    ChatDao chatDao;

    //获取Access_Token
    public void getAccess_Token() throws IOException {
        String url = "https://aip.baidubce.com/oauth/2.0/token";
        Map params = new HashMap();
        params.put("grant_type", "client_credentials");
        params.put("client_id", API_KEY);
        params.put("client_secret", SECRET_KEY);
        String a = okHttpCli.doPost(url, params);
        String access_token = new JSONObject(a).getString("access_token");
        this.Access_Token = access_token;
    }

    //获得信息
    public JSONObject getMessage(String msg, String access_Token) throws IOException {
        System.out.println("msg:" + msg);
        String url = "https://aip.baidubce.com/rpc/2.0/ai_custom/v1/wenxinworkshop/chat/completions?access_token=" + access_Token;
        String json = "{\"messages\":[{\"role\":\"user\",\"content\":\"" + msg + "\"}]}";
        String message = okHttpCli.doPostJson(url, json);
        return new JSONObject(message);
    }

    public Chat getUserHistory(String userId) {
        Chat chat = chatDao.findByUserId(userId);
        System.out.println(chat == null);
        return chat;
    }

    public String create(String history, String question) throws InterruptedException {
        Map params = runChatModel(history, question);
        return params.get("Answner").toString();
    }

    public Map runChatModel(String history, String question) throws InterruptedException {
        ChatClient client = new ChatClient("localhost", 50052);
        try {
            return client.greet(history, question);
        } finally {
            client.shutdown();
        }
    }

}
