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

    @Select("select * from url where url like concat('%',#{url},'%') and remark like concat('%',#{remark},'%') order by createTime desc limit 100")
    public List<UrlEntity> getUrlListByUrl(@Param("url")String url,@Param("remark")String remark);

    @Select("select * from url  order by createTime desc limit 100")
    public List<UrlEntity> getUrlTop10();

    @Insert("insert into url (url,remark,createTime) values (#{urlEntity.url},#{urlEntity.remark},#{urlEntity.createTime})")
    public void insertUrl(@Param("urlEntity") UrlEntity urlEntity);

}
