package com.xfl.vo;

import java.io.Serializable;

/**
 * Created by XFL
 * time on 2017/12/3 23:00
 * description:
 */
public class UserVo implements Serializable{
    private String name;

    public UserVo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "name='" + name + '\'' +
                '}';
    }
}
