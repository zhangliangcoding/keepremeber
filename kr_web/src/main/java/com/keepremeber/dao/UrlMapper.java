package com.keepremeber.dao;

import com.keepremeber.bean.UrlEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Mocha on 2017/6/25.
 */
@Mapper
public interface UrlMapper {

    @Select("select * from url where url like concat('%',#{url},'%')")
    public List<UrlEntity> getUrlListByUrl(@Param("url")String url);

    @Insert("insert into url (url,remark,createTime) values (#{urlEntity.url},#{urlEntity.remark},#{urlEntity.createTime})")
    public void insertUrl(@Param("urlEntity") UrlEntity urlEntity);

}
