package com.example.project_springboot2.controller;

import com.example.project_springboot2.pojo.Accusation.Accusation;
import com.example.project_springboot2.pojo.Accusation.AccusationBean;
import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.service.AccusationService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/accusation")
public class AccusationController {
    @Autowired
    AccusationService1 accusationService1;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Response<Accusation> sendMessage(@RequestBody Accusation accusation) {
        accusationService1.add(accusation);
        return Response.success(null);
    }

    @RequestMapping(value = "/selectByPage", method = RequestMethod.GET)
    @ResponseBody
    public AccusationBean selectByPage(int currentPage, int pageSize) {
        AccusationBean accusationBean = accusationService1.selectPage(currentPage, pageSize);
        return accusationBean;
    }
}
