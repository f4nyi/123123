package com.example.project_springboot2.service.Url;

import com.example.project_springboot2.dao.Url.WhiteURLDao;
import com.example.project_springboot2.pojo.Url.WhiteURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WhiteURLservice1 {
    @Autowired
    WhiteURLDao whiteURLDao;

    public List<WhiteURL> findAll(){return whiteURLDao.findAll();}

    public void add(WhiteURL whiteURL){whiteURLDao.add(whiteURL);}

    public WhiteURL findByUrl(String url){
        if (whiteURLDao.findByUrl(url)!=null)
            return whiteURLDao.findByUrl(url);
        else {
            System.out.println(url+"未在白名单内");
            return null;
        }
    }
}
