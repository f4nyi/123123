package com.example.project_springboot2.dao.publicity;


import com.example.project_springboot2.pojo.publicity.Law;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface LawDao {
    @Select("select * from tb_laws")
    List<Law> findAll();
    @Select("select  * from tb_laws where id = #{id}")
    Law findById(Integer id);
}
