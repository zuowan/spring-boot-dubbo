package com.example.api.service;

import com.example.api.dto.UserDto;

import java.util.List;

/**
 *  用户操作
 */
public interface UserService {

    /**
     * 查询用户详情
     * @param id 业务主键id
     * @return
     */
    UserDto queryById(String id);

    /**
     * 获取分页列表
     * @param page
     * @param pageSize
     * @return
     */
    List<UserDto> queryList(int page,int pageSize);

}
