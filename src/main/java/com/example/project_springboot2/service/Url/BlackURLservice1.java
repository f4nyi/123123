package com.example.project_springboot2.service.Url;

import com.example.project_springboot2.dao.Url.BlackURLDao;
import com.example.project_springboot2.pojo.Url.BlackURL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlackURLservice1 {
    @Autowired
    BlackURLDao blackURLDao;

    public List<BlackURL> findAll(){return blackURLDao.findAll();}

    public void add(BlackURL blackURL){ blackURLDao.add(blackURL);}

    public BlackURL findByUrl(String url){
        if (blackURLDao.findByUrl(url)!=null)
            return blackURLDao.findByUrl(url);
        else {
            System.out.println(url+"未在黑名单内");
            return null;
        }
    }
}
