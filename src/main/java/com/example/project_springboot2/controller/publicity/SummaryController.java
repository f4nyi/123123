package com.example.project_springboot2.controller.publicity;


import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.pojo.publicity.Summary;
import com.example.project_springboot2.service.publicity.SummaryService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/summary")
public class SummaryController {
    @Autowired
    SummaryService1 summaryService1;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    @ResponseBody
    public Response<Summary> init() {
        Summary summary = summaryService1.init();
        return Response.success(summary);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Response<Summary> findById(@PathVariable("id") Integer id) {
        Summary summary = summaryService1.findById(id);
        return Response.success(summary);
    }

    @RequestMapping(value = "/previous", method = RequestMethod.GET)
    @ResponseBody
    public Response<Summary> previous(Integer id) {
        Summary summary = summaryService1.findLastById(id);
        return Response.success(summary);
    }

    @RequestMapping(value = "/next", method = RequestMethod.GET)
    @ResponseBody
    public Response<Summary> next(Integer id) {
        Summary summary = summaryService1.findNextById(id);
        return Response.success(summary);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<Summary>> findAll() {
        List<Summary> summaryList = summaryService1.findAll();
        return Response.success(summaryList);
    }
}
