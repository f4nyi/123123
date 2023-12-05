package com.example.project_springboot2.service.Intelligence;

import com.example.project_springboot2.dao.Intelligence.IntelligenceInfoDao;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntelligenceInfoService1 {
    @Autowired
    IntelligenceInfoDao intelligenceInfoDao;

    public List<IntelligenceInfo> findAll(){return intelligenceInfoDao.findAll();}
}
