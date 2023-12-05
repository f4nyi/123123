package com.example.project_springboot2.dao;

import com.example.project_springboot2.pojo.Chat;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ChatDao {
    @Select("select * from tb_chat where  user_id= #{userId}")
    Chat findByUserId(String userId);

    @Insert("insert into tb_chat(user_id, history_question) values(#{userID},#{history})")
    void addChat(Chat chat);

    @Update("update tb_chat set history_question = #{history} where user_id = #{userID}")
    void updateHistory(Chat chat);
}
