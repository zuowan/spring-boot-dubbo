package com.example.api.service;

import com.example.api.dto.OrderDto;

import java.util.List;

/**
 *  订单操作
 *  @version 1.1.0
 *  @dubbo
 */
public interface OrderService {


    /**
     * 获取订单主键
     *
     * @return {@link OrderDto}
     */
    OrderDto queryById(String id);

    /**
     * 分页获取订单数据
     *
     * @param page
     * @param pageSize
     * @return {@link List<OrderDto>}
     * @DocView.Name 分页获取订单数据
     */
    List<OrderDto> queryList(int page, int pageSize);


    /**
     * @param b b
     * @return int
     * @DocView.Name 转换
     */
    int a(String b);

}
