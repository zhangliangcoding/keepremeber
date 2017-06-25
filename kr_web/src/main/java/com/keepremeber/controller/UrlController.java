package com.keepremeber.controller;

import com.keepremeber.bean.UrlEntity;
import com.keepremeber.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Mocha on 2017/6/25.
 */
@RestController
@RequestMapping("/url")
public class UrlController {
    @Autowired
    private UrlService service;

    @RequestMapping("getList")
    @ResponseBody
    private Object getListByUrl(String url){
        return service.getUrlListByUrl(url);
    }
    @RequestMapping("insert")
    @ResponseBody
    public String insertUrl(UrlEntity urlEntity){
        return service.insertUrl(urlEntity);
    }
}
