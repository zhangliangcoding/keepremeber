package com.keepremeber.controller;

import com.keepremeber.bean.UrlEntity;
import com.keepremeber.service.UrlService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Mocha on 2017/6/25.
 */
@Controller
public class UrlController {
    @Autowired
    private UrlService service;

    @RequestMapping("/search")
    private String getListByUrl(Model model,@Param("url") String url,@Param("remark") String remark){
        model.addAttribute("urlList",service.getUrlListByUrl(url,remark));
        return "index";
    }

    @RequestMapping("/index")
    private String index(Model model){
        model.addAttribute("urlList",service.getUrlTop10());
        return "index";
    }

    @RequestMapping("/insert")
    public String insertUrl(Model model,@Param("urlEntity") UrlEntity urlEntity){
        service.insertUrl(urlEntity);
        model.addAttribute("urlList",service.getUrlTop10());
        return "index";
    }
}
