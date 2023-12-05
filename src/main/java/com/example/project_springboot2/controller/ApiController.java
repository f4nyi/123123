package com.example.project_springboot2.controller;

import com.example.project_springboot2.pojo.Response;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Zhuo
 */
@CrossOrigin(maxAge = 3600, origins = "*", allowedHeaders = "*")
@Controller
public class ApiController {


    @RequestMapping(value = "/getTypes", method = RequestMethod.GET)
    @ResponseBody
    public Response<String[]> getTypes() {
        return Response.success(new String[]{"正常","购物消费", "婚恋交友", "假冒身份", "钓鱼网站", "冒充公检法", "平台诈骗", "招聘兼职", "杀猪盘", "博彩赌博", "信贷理财", "刷单诈骗", "中奖诈骗"});
    }


}
