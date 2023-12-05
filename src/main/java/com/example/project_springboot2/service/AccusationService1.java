package com.example.project_springboot2.service;

import com.example.project_springboot2.dao.AccusationDao;
import com.example.project_springboot2.pojo.Accusation.Accusation;
import com.example.project_springboot2.pojo.Accusation.AccusationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccusationService1 {
    @Autowired
    AccusationDao accusationDao;

    public List<Accusation> findAll() {
        return accusationDao.findAll();
    }

    public Accusation add(Accusation accusation) {
        accusationDao.add(accusation);
        return null;
    }

    //分页查找函数
    public AccusationBean selectPage(int currentPage, int pagesize) {
        int begin = (currentPage - 1) * pagesize;
        int size = pagesize;
        List<Accusation> accusationList = accusationDao.selectByPage(begin, size);
        int totalCount = accusationDao.seletTotalCount();
        AccusationBean accusationBean = new AccusationBean(totalCount, accusationList);
        return accusationBean;
    }
}
