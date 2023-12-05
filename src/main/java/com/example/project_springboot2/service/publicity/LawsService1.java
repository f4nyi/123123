package com.example.project_springboot2.service.publicity;

import com.example.project_springboot2.dao.publicity.LawDao;
import com.example.project_springboot2.pojo.publicity.Law;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LawsService1 {
    @Autowired
    LawDao lawDao;

    public List<Law> listAll() {
        return lawDao.findAll();
    }

    public Law findById(Integer id) {
        return lawDao.findById(id);
    }


}
