package com.example.project_springboot2.dao.Intelligence;

import com.example.project_springboot2.pojo.Intelligence.IntelligenceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IntelligenceInfoDao {
    @Select("select * from tb_intelligence_info")
    List<IntelligenceInfo> findAll();
}
