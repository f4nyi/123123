package com.example.project_springboot2.controller;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.example.project_springboot2.pojo.CheatWebsite.CheatWebsite;
import com.example.project_springboot2.pojo.CheatWebsite.CheatWebsiteBean;
import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.pojo.Url.BlackURL;
import com.example.project_springboot2.pojo.Url.WhiteURL;
import com.example.project_springboot2.service.CheatWebsiteService1;
import com.example.project_springboot2.service.Url.BlackURLservice1;
import com.example.project_springboot2.service.Url.WhiteURLservice1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@CrossOrigin(maxAge = 3600, origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping("/url")
public class URLcontroller {
    @Autowired
    WhiteURLservice1 whiteURLservice1;
    @Autowired
    BlackURLservice1 blackURLservice1;
    @Autowired
    CheatWebsiteService1 cheatWebsiteService1;

    @RequestMapping(value = "/sendWhiteURL", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<WhiteURL>> sendWhiteURL() {
        List<WhiteURL> list = whiteURLservice1.findAll();
        return Response.success(list);
    }

    @RequestMapping(value = "/sendBlackURL", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<BlackURL>> sendBlackURL() {
        List<BlackURL> list = blackURLservice1.findAll();
        return Response.success(list);
    }

    @RequestMapping(value = "/detectUrl", method = RequestMethod.GET)
    @ResponseBody
    public Response<CheatWebsite> getURL(String url) throws InterruptedException {
        CheatWebsite cheatWebsite = cheatWebsiteService1.add(url);
        return Response.success(cheatWebsite);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public Response<CheatWebsite> sendMessage(String url) {
        CheatWebsite cheatWebsite = cheatWebsiteService1.findByUrl(url);
        if (cheatWebsite == null) {
            return Response.failure(cheatWebsite);
        }
        return Response.success(cheatWebsite);
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    @ResponseBody
    public Response<CheatWebsite> check(@RequestBody String url) throws InterruptedException {
        JSONObject map = JSON.parseObject(url);
        CheatWebsite result = cheatWebsiteService1.add(map.getString("url"));
        System.out.println(result);
        return Response.success(result);
    }


    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseBody
    public Response<CheatWebsiteBean<CheatWebsite>> selectByPage(int currentPage, int pageSize) {
        CheatWebsiteBean<CheatWebsite> cheatWebsiteCheatWebsiteBean = cheatWebsiteService1.selectPage(currentPage, pageSize);
        return Response.success(cheatWebsiteCheatWebsiteBean);
    }
}
