package com.example.project_springboot2.service.publicity;

import com.example.project_springboot2.dao.publicity.StateDao;
import com.example.project_springboot2.pojo.publicity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Zhuo
 */
@Service
public class StateService1 {
    @Autowired
    StateDao stateDao;

    public List<State> findAll() {
        return stateDao.findAll();
    }

    public State findById(Integer id) {
        return stateDao.findById(id);
    }

}
