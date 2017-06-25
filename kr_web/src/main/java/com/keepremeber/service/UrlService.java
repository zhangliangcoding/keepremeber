package com.keepremeber.service;

import com.keepremeber.bean.UrlEntity;
import com.keepremeber.dao.UrlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Mocha on 2017/6/25.
 */
@Service
public class UrlService {
    @Autowired
    private UrlMapper urlMapper;

    public List<UrlEntity> getUrlListByUrl(String url,String remark){
        return urlMapper.getUrlListByUrl(url);
    }

    public List<UrlEntity> getUrlTop10(){
        return urlMapper.getUrlTop10();
    }

    public String insertUrl(UrlEntity urlEntity) {
        urlEntity.setCreateTime(new Date());
        urlMapper.insertUrl(urlEntity);
        return  "insert url["+urlEntity.getUrl()+"] success";
    }

}
