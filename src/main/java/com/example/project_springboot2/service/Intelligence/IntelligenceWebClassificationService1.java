package com.example.project_springboot2.service.Intelligence;

import com.example.project_springboot2.dao.Intelligence.IntelligenceWebClassificationDao;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceWebClassification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntelligenceWebClassificationService1 {
    @Autowired
    IntelligenceWebClassificationDao intelligenceWebClassificationDao;

    public IntelligenceWebClassification findById(Integer id){return intelligenceWebClassificationDao.findById(id);}

    public List<IntelligenceWebClassification> findAll(){return intelligenceWebClassificationDao.findAll();}
}
