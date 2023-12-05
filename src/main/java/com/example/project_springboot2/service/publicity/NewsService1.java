package com.example.project_springboot2.service.publicity;

import com.example.project_springboot2.dao.publicity.NewsDao;
import com.example.project_springboot2.pojo.publicity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService1 {
    @Autowired
    private NewsDao newsDao;

    //网页初始化，id=1
    public News initById(){return  newsDao.findById(1);}

    //按序号查找新闻
    public News findById(Integer id){
        if(id>=1&&id<=83) {
            return newsDao.findById(id);
        } else {
            return newsDao.findById(1);
        }
    }

    //上一条新闻
    public News findLastById(Integer id){

        if(newsDao.findById(id-1)!= null)
            return newsDao.findById(id-1);
        else
            return newsDao.findById(83);
    }

    //下一条新闻
    public News findNextById(Integer id){
        if(newsDao.findById(id+1)!= null)
            return newsDao.findById(id+1);
        else
            return newsDao.findById(1);
    }

    public List<News> findAll(){
        return newsDao.findAll();
    }
}
