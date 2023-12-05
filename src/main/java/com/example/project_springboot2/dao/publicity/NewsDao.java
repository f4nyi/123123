package com.example.project_springboot2.dao.publicity;

import com.example.project_springboot2.pojo.publicity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsDao {

    @Select("select * from tb_news where id = #{id}")
    News findById(Integer id);

    @Select("select * from tb_news order by time DESC ")
    List<News> findAll();
}
