package com.example.service.impl;

import com.example.api.dto.UserDto;
import com.example.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

@DubboService(version = "1.0.0",timeout = 5000,interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {
    @Override
    public UserDto queryById(String id) {
        return null;
    }

    @Override
    public List<UserDto> queryList(int page, int pageSize) {
        return null;
    }
}
