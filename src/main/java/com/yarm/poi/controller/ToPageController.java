package com.yarm.poi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IDEA
 * author:Yarm.Yang
 * Date:2019/1/21
 * Time:9:31
 * Des:页面跳转
 */
@Controller
@RequestMapping("page")
public class ToPageController {

    @RequestMapping("index")
    public String toIndex(){
        return "page/index";
    }

}