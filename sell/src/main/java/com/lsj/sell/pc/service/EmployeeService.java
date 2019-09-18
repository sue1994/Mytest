package com.lsj.sell.pc.service;

import com.lsj.sell.model.PageModel;
import java.util.Map;

/**
 * @author lisujing
 * @date 2019-09-17 14:27
 */
public interface EmployeeService {
    PageModel<Map<String,Object>> getEmployeeList(PageModel pageModel);
}
