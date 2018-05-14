package com.example.demo.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;

@Controller
@MapperScan("com.example.demo.mapper")//mapper包路径
public class DemoController {

}
