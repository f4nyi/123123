package com.example.project_springboot2.service.publicity;

import com.example.project_springboot2.dao.publicity.SummaryDao;
import com.example.project_springboot2.pojo.publicity.Summary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummaryService1 {
    @Autowired
    SummaryDao summaryDao;

    public Summary init(){return summaryDao.findById(1);}

    public Summary findById(Integer id){
        if(id>=1&&id<=13)
            return summaryDao.findById(id);
        else
            return summaryDao.findById(1);
    }
    public Summary findLastById(Integer id){
        if(summaryDao.findById(id-1)!=null)
            return summaryDao.findById(id-1);
        else
            return summaryDao.findById(13);
    }

    public Summary findNextById(Integer id){
        if(summaryDao.findById(id+1)!=null)
            return summaryDao.findById(id+1);
        else
            return summaryDao.findById(1);
    }

    public List<Summary> findAll(){return summaryDao.findAll();}
}
