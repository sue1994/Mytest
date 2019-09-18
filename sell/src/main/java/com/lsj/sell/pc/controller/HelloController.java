package com.lsj.sell.pc.controller;

import com.lsj.sell.model.Product;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
@Api(tags = {"你好，世界"})
public class HelloController {

    @PostMapping("/index")
    @ResponseBody
    @ApiOperation(value = "你好世界首页", notes = "事实说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码(六位数)", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "age", value = "年龄", required = true, dataType = "int",paramType = "query")
    })
    public String index(String name, String password, Integer age, Model model){
        if(name.isEmpty()||password.isEmpty()){
            return "false";
        }else{
            if(age==null){
                return "false";
            }
            return name+":"+age;
        }
    }

    @PostMapping("/login")
    @ResponseBody
    @ApiOperation(value = "登录页面", notes = "事实说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "password", value = "密码(六位数)", required = true, dataType = "String",paramType = "query")
    })
    public Product login(String name, String password,Product product){
        return new Product();
    }
}
