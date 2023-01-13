package com.ehsanzhao.mvc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author zhaoyuan
 * @date 2023/1/10
 */
@Data
public class User {

    private Long id;

    private String username;

    private String password;

    private String[] role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + Arrays.toString(role) +
                '}';
    }
}
