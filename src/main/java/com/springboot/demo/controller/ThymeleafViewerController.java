package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @Author Wu Ming
 * @Date 2020/3/27 23:32
 * @Version 1.0
 */


//注意，这里只能用@Controller不能用@RestController，后者会直接输出json格式的/index,而不是跳转页面
//@RequestMapping("/helloHtml")和@GetMapping("/helloHtml")两种方式都是可以的，springboot中允许有不同类型的请求方式
//另外，我试了下 在返回页面是写成index或者//index也是可以的.
@Controller
public class ThymeleafViewerController {
    //@RequestMapping("/helloHtml")
    @GetMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","小仙女你好");
        return "/index";
    }
}
