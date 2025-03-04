package com.shanzhu.oe.entity;

import lombok.Data;

/**
 * 用户登录信息
 *
 *
 */
@Data
public class Login {

    /**
     * 用户名（id）
     */
    private Integer username;

    /**
     * 密码
     */
    private String password;

}
