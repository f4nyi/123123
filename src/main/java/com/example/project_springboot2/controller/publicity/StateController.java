package com.example.project_springboot2.controller.publicity;

import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.pojo.publicity.State;
import com.example.project_springboot2.service.publicity.StateService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/state")
public class StateController {
    @Autowired
    StateService1 stateService1;

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<State>> listAllClassification() {
        List<State> stateList = stateService1.findAll();
        return Response.success(stateList);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Response<State> findById(@PathVariable Integer id) {
        State state = stateService1.findById(id);
        return Response.success(state);
    }

}
