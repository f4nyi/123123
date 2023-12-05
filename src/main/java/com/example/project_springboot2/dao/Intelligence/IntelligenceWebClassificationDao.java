package com.example.project_springboot2.dao.Intelligence;

import com.example.project_springboot2.pojo.Intelligence.IntelligenceWebClassification;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IntelligenceWebClassificationDao {
    @Select("select * from tb_intelligence_web_classification where id = #{id}")
    IntelligenceWebClassification findById(Integer id);
    @Select("select * from tb_intelligence_web_classification")
    List<IntelligenceWebClassification> findAll();
}
