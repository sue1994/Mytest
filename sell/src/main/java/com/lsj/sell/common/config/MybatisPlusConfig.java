package com.lsj.sell.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * @author lisujing
 * @date 2019-09-17 14:30
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.lsj.sell.*.mapper.*")
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        paginationInterceptor.setLimit(-1);
        return paginationInterceptor;
    }
    /**
     * SQL执行效率插件
     */
    /*@Bean
    @Profile({"dev","test"})// 设置 dev test 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(1000000);
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }*/

    /**

     * 打印 sql

     */

    @Bean
    public PerformanceInterceptor performanceInterceptor() {

        PerformanceInterceptor performanceInterceptor =new PerformanceInterceptor();

        //格式化sql语句

        Properties properties =new Properties();

        properties.setProperty("format", "false");

        performanceInterceptor.setProperties(properties);

        return performanceInterceptor;

    }
}
