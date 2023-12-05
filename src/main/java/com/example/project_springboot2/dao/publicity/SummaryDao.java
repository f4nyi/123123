package com.example.project_springboot2.dao.publicity;


import com.example.project_springboot2.pojo.publicity.Summary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SummaryDao {
    @Select("select * from tb_routinessummary where id=#{id}")
    Summary findById(Integer id);
    @Select("select * from tb_routinessummary")
    List<Summary> findAll();
}
