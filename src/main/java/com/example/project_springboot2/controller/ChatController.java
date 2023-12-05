package com.example.project_springboot2.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.service.WWYXService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.net.URLDecoder;

@Controller
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    WWYXService1 wwyxService1;
    long start_time = 0;

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    @ResponseBody
    public Response<String> chat(@RequestBody String message) throws IOException {
        String b = message.substring(1, message.length() - 1);
        String msg = URLDecoder.decode(b, "UTF-8");
        long now_time = System.currentTimeMillis();
        if (wwyxService1.Access_Token == null) {
            wwyxService1.getAccess_Token();
        }
        if ((now_time - start_time) / 60000 > 10) {
            wwyxService1.getAccess_Token();
            start_time = now_time;
        }
        org.json.JSONObject reply = wwyxService1.getMessage(msg, wwyxService1.Access_Token);
        if (reply.has("result")) {
            System.out.println("reply:" + reply.getString("result"));
            return Response.success(reply.getString("result"));
        } else {
            System.out.println("error_msg:" + reply.getString("error_msg"));
            return Response.failure(reply.getString("error_msg"));
        }
    }

    @RequestMapping(value = "/fraud", method = RequestMethod.POST)
    @ResponseBody
    public Response<String> fraud(@RequestBody String param) throws InterruptedException {
        JSONObject map = JSON.parseObject(param);
        String question = map.getString("question");
        JSONArray history = JSON.parseArray(map.getString("history"));
        String answer = wwyxService1.create(String.valueOf(history), question);
        System.out.println("对话创建：" + answer);
        return Response.success(answer);
    }
}
