package com.example.service.impl;

import com.example.api.dto.OrderDto;
import com.example.api.service.OrderService;
import com.example.service.dao.SOrderDao;
import com.example.service.entity.SOrder;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@DubboService(version = "1.0.0",timeout = 5000,interfaceClass = OrderService.class)
public class OrderImpl implements OrderService {

    @Autowired
    private SOrderDao sOrderDao;

    @Override
    public OrderDto queryById(String id) {

        SOrder one = sOrderDao.getOne(id);

        OrderDto orderDto = new OrderDto();

        BeanUtils.copyProperties(one,orderDto);

        return orderDto;
    }

    @Override
    public List<OrderDto> queryList(int page,int pageSize) {

        PageRequest of = PageRequest.of(page, pageSize);

        Page<SOrder> all = sOrderDao.findAll(of);

        List<OrderDto> list = new ArrayList<>();

        Iterator<SOrder> iterator = all.iterator();

        while (iterator.hasNext()){
            OrderDto orderDto = new OrderDto();
            BeanUtils.copyProperties(iterator.next(),orderDto);
            list.add(orderDto);
        }

        return list;
    }

    @Override
    public int a(String b) {
        return 0;
    }
}
