package com.example.project_springboot2.service.Intelligence;

import com.example.project_springboot2.dao.Intelligence.IntelligenceIPDao;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceIP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntelligenceIPService1 {
    @Autowired
    IntelligenceIPDao intelligenceIPDao;

    public List<IntelligenceIP> findAll(){return intelligenceIPDao.findAll();}
}
