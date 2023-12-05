package com.example.project_springboot2.dao;

import com.example.project_springboot2.pojo.Accusation.Accusation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccusationDao {

    @Insert("insert into tb_accusation(url,type,reason,timeChuo) values(#{url},#{type},#{reason},#{timeChuo})")
    void add(Accusation accusation);

    @Select("select * from tb_accusation")
    List<Accusation> findAll();

    @Select("select * from tb_accusation limit #{begin},#{size}")
    List<Accusation> selectByPage(@Param("begin") int begin, @Param("size") int size);

    @Select("select count(*) from tb_accusation")
    int seletTotalCount();

}
