package com.example.project_springboot2.service.Intelligence;

import com.example.project_springboot2.dao.Intelligence.IntelligenceWebContentDao;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceWebContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntelligenceWebContentService1 {
    @Autowired
    IntelligenceWebContentDao intelligenceWebContentDao;

     public List<IntelligenceWebContent> findByClassification(Integer classification){return intelligenceWebContentDao.findByClassification(classification);}
}
