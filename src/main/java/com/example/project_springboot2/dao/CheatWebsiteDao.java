package com.example.project_springboot2.dao;

import com.example.project_springboot2.pojo.CheatWebsite.CheatWebsite;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Zhuo
 */
@Mapper
public interface CheatWebsiteDao {
    @Select("select * from tb_cheat_websites where url = #{url}")
    CheatWebsite findByUrl(String url);
    @Select("select * from tb_cheat_websites where id = #{id}")
    CheatWebsite findById(Integer id);
    @Insert("insert into tb_cheat_websites(url,stat,imgNum,domainInNum,domainOutNum,domainInNum1,domainOutNum1,iframeNum,metaNum,embedNum,objectNum,scriptNum,evalNum,setTimeoutNum,setIntervalNum,locationNum,openNum,srcNum,setAttributeNum,innerHTMLNum,whoisInfo,register,updatedDate,creationDate,email,svmType,dtType,rfType,adaboostType,gbdType,ncmType,timeChuo) values(#{url},#{stat},#{imgNum},#{domainInNum},#{domainOutNum},#{domainInNum1},#{domainOutNum1},#{iframeNum},#{metaNum},#{embedNum},#{objectNum},#{scriptNum},#{evalNum},#{setTimeoutNum},#{setIntervalNum},#{locationNum},#{openNum},#{srcNum},#{setAttributeNum},#{innerHTMLNum},#{whoisInfo},#{register},#{updatedDate},#{creationDate},#{email},#{svmType},#{dtType},#{rfType},#{adaboostType},#{gbdType},#{ncmType},#{timeChuo})")
    void add(CheatWebsite cheatWebsite);
    @Select("select * from tb_cheat_websites limit #{begin},#{size}")
    List<CheatWebsite> selectByPage(@Param("begin") int begin, @Param("size") int size);
    @Select("select count(*) from tb_cheat_websites")
    int seletTotalCount();
}
