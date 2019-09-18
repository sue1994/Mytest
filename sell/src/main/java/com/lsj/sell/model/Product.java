package com.lsj.sell.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(description= "产品信息")
public class Product {
    private Integer id;
    @ApiModelProperty(value = "产品名称", required = true)
    private String productName;
    @ApiModelProperty(value = "产品价格", required = true)
    private BigDecimal productPrice;
    @ApiModelProperty(value = "产品颜色")
    private String color;
    @ApiModelProperty(value = "产品描述")
    private String description;
}
