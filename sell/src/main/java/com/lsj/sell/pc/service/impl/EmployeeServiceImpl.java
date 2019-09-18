package com.lsj.sell.pc.service.impl;

import com.lsj.sell.model.PageModel;
import com.lsj.sell.pc.mapper.EmployeeMapper;
import com.lsj.sell.pc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * @author lisujing
 * @date 2019-09-17 14:27getEmployeeList
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public PageModel<Map<String, Object>> getEmployeeList(PageModel pageModel){
        return employeeMapper.getEmployeeList(pageModel);
    }
}
