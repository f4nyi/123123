package com.example.project_springboot2.controller;

import com.example.project_springboot2.pojo.Intelligence.IntelligenceIP;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceInfo;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceWebClassification;
import com.example.project_springboot2.pojo.Intelligence.IntelligenceWebContent;
import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.service.Intelligence.IntelligenceIPService1;
import com.example.project_springboot2.service.Intelligence.IntelligenceInfoService1;
import com.example.project_springboot2.service.Intelligence.IntelligenceWebClassificationService1;
import com.example.project_springboot2.service.Intelligence.IntelligenceWebContentService1;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/intelligence")
public class IntelligenceController {
    @Autowired
    IntelligenceWebClassificationService1 intelligenceWebClassificationService1;
    @Autowired
    IntelligenceWebContentService1 intelligenceWebContentService1;
    @Autowired
    IntelligenceIPService1 intelligenceIPService1;
    @Autowired
    IntelligenceInfoService1 intelligenceInfoService1;

    @RequestMapping(value = "/listAllClassification", method = RequestMethod.GET)
    @ResponseBody
    public List<IntelligenceWebClassification> listAllClassification() {
        List<IntelligenceWebClassification> lawList = intelligenceWebClassificationService1.findAll();
        return lawList;
    }

    @RequestMapping(value = "/findByClassification", method = RequestMethod.GET)
    @ResponseBody
    public List<IntelligenceWebContent> listAll(Integer classification) {
        List<IntelligenceWebContent> lawList = intelligenceWebContentService1.findByClassification(classification);
        return lawList;
    }

    @RequestMapping(value = "/listAllIP", method = RequestMethod.GET)
    @ResponseBody
    public List<IntelligenceIP> listAllIP() {
        List<IntelligenceIP> lawList = intelligenceIPService1.findAll();
        return lawList;
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<IntelligenceInfo>> listAllInfo() {
        List<IntelligenceInfo> list = intelligenceInfoService1.findAll();
        return Response.success(list);
    }
}
