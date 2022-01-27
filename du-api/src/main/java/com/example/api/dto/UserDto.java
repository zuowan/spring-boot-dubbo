package com.example.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {

    /**
     * 用户id
     *
     * @DocView.Required
     */
    private String userId;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 年龄
     */
    private int age;
}
