package com.lsj.sell.pc.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lsj.sell.model.PageModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author lisujing
 * @date 2019-09-17 9:52
 */
@Mapper
public interface EmployeeMapper extends BaseMapper {
    PageModel<Map<String,Object>> getEmployeeList(@Param("page")PageModel pageModel);
}
