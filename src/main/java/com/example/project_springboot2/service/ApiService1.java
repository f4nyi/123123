package com.example.project_springboot2.service;

import com.example.project_springboot2.pojo.Url.BlackURL;
import com.example.project_springboot2.pojo.CheatWebsite.CheatWebsite;
import com.example.project_springboot2.pojo.Url.URLBean;
import com.example.project_springboot2.pojo.Url.WhiteURL;
import com.example.project_springboot2.service.Url.BlackURLservice1;
import com.example.project_springboot2.service.Url.WhiteURLservice1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService1 {
    @Autowired
    WhiteURLservice1 whiteURLservice1;
    @Autowired
    BlackURLservice1 blackURLservice1;
    @Autowired
    CheatWebsiteService1 cheatWebsiteService1;

    public URLBean<WhiteURL> sendWhiteURLBean(){
        int code;
        String text;
        List<WhiteURL> list=whiteURLservice1.findAll();
        if(list== null){
            code=400;
            text="查找失败，请重试";
        }else {
            code=200;
            text="查找成功";
        }
        URLBean<WhiteURL> whiteURLURLBean=new URLBean<>(code,list,text);
        return whiteURLURLBean;
    }

    public URLBean<BlackURL> sendBlackURLBean(){
        int code;
        String text;
        List<BlackURL> list=blackURLservice1.findAll();
        if(list== null){
            code=400;
            text="查找失败，请重试";
        }else {
            code=200;
            text="查找成功";
        }
        URLBean<BlackURL> blackURLBean=new URLBean<>(code,list,text);
        return blackURLBean;
    }

    public URLBean<CheatWebsite> sendCheatWebsiteBean(String url){
        int code;
        String text;
        List<CheatWebsite> list=new ArrayList<>();
        CheatWebsite cheatWebsite=cheatWebsiteService1.findByUrl(url);
        if(cheatWebsite== null){
            code=400;
            text="查找失败，请重试";
        }else {
            code=200;
            text="查找成功";
        }
        list.add(cheatWebsite);
        URLBean<CheatWebsite> cheatWebsiteURLBean=new URLBean<>(code,list,text);
        return cheatWebsiteURLBean;
    }


}
