package com.lsj.sell;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SellApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SellApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
        LOGGER.debug("[启动成功]" + new Date());
    }

}
