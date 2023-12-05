package com.example.project_springboot2.dao.Intelligence;

import com.example.project_springboot2.pojo.Intelligence.IntelligenceIP;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IntelligenceIPDao {
    @Select("select * from tb_intelligence_ip")
    List<IntelligenceIP> findAll();
}
