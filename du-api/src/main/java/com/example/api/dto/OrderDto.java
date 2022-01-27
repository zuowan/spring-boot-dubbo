package com.example.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class OrderDto implements Serializable {
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 收货人信息
     *
     */
    private String name;

    /**
     * 订单金额
     */
    private BigDecimal payAmount;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;
}