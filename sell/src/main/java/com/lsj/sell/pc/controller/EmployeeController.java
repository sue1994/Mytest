package com.lsj.sell.pc.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lsj.sell.model.PageModel;
import com.lsj.sell.pc.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lisujing
 * @date 2019-09-17 14:30
 */
@Controller
@RequestMapping("/employee")
@Api(tags = {"员工信息"})
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/index")
    @ResponseBody
    @ApiOperation(value="员工列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "当前第几页", required = true, dataType = "int",paramType = "query"),
            @ApiImplicitParam(name = "employeeName", value = "员工姓名",  dataType = "String",paramType = "query"),
            @ApiImplicitParam(name = "sex", value = "性别（0：男 1：女）", dataType = "int",paramType = "query")
    })
    public IPage<Map<String, Object>> index(Integer currentPage,String employeeName,Integer sex){
        PageModel pageModel =new PageModel();
        pageModel.setCurrent(currentPage);
        pageModel.setSize(5);
        Map<String, Object> params = new HashMap<>();
        params.put("employeeName",employeeName);
        params.put("sex",sex);
        pageModel.setParams(params);
        IPage<Map<String, Object>> allStudentInfoList=employeeService.getEmployeeList(pageModel);
        return allStudentInfoList;
    }
}
