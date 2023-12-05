package com.example.project_springboot2.controller.publicity;


import com.example.project_springboot2.pojo.Response;
import com.example.project_springboot2.pojo.publicity.News;
import com.example.project_springboot2.service.publicity.NewsService1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600, origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping("/news")
public class NewsController {
    @Autowired
    NewsService1 newsService1;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    @ResponseBody
    public Response<News> init() {
        News news = newsService1.initById();
        return Response.success(news);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Response<News> findById(@PathVariable("id") Integer id) {
        return Response.success(newsService1.findById(id));
    }

    @RequestMapping(value = "/previous", method = RequestMethod.GET)
    @ResponseBody
    public Response<News> previous(int id) {
        News news = newsService1.findLastById(id);
        return Response.success(news);
    }

    @RequestMapping(value = "/next", method = RequestMethod.GET)
    @ResponseBody
    public Response<News> next(int id) {
        News news = newsService1.findNextById(id);
        return Response.success(news);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public Response<List<News>> findAll() {
        List<News> newsList = newsService1.findAll();
        return Response.success(newsList);
    }
}
