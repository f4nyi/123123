package com.example.project_springboot2.dao.Url;

import com.example.project_springboot2.pojo.Url.BlackURL;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BlackURLDao {
    @Select("select * from tb_blackurl where url = #{url}")
    BlackURL findByUrl(String url);
    @Select("select * from tb_blackurl")
    List<BlackURL> findAll();
    @Insert("insert into tb_blackurl(url) values(#{url})")
    void add(BlackURL blackURL);
}
