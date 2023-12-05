package com.example.project_springboot2.dao.Url;

import com.example.project_springboot2.pojo.Url.WhiteURL;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WhiteURLDao {
    @Select("select * from tb_whiteurl where url = #{url}")
    WhiteURL findByUrl(String url);
    @Select("select * from tb_whiteurl")
    List<WhiteURL> findAll();
    @Insert("insert into tb_whiteurl(url) values(#{url})")
    void add(WhiteURL whiteURL);

}
