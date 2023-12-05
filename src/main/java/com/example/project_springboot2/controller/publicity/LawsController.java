package com.example.project_springboot2.controller.publicity;


import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.pojo.publicity.Law;
import com.example.project_springboot2.service.publicity.LawsService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Zhuo
 */
@Controller
@RequestMapping("/laws")
public class LawsController {
    @Autowired
    LawsService1 lawsService1;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<Law>> listAll() {
        List<Law> lawList = lawsService1.listAll();
        return Response.success(lawList);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Response<Law> findById(@PathVariable Integer id) {
        Law law = lawsService1.findById(id);
        return Response.success(law);
    }
}
