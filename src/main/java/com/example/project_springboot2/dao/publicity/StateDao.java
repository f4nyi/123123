package com.example.project_springboot2.dao.publicity;

import com.example.project_springboot2.pojo.publicity.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Zhuo
 */
@Mapper
public interface StateDao {
    @Select("select * from tb_state")
    List<State> findAll();

    @Select("select * from tb_state where id = #{id}")
    State findById(Integer id);
}
