package com.example.project_springboot2.dao.Intelligence;

import com.example.project_springboot2.pojo.Intelligence.IntelligenceWebContent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IntelligenceWebContentDao {
    @Select("select * from tb_intelligence_web_content where classification = #{classification}")
    List<IntelligenceWebContent> findByClassification(Integer classification);
}
