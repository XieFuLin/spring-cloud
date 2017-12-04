package com.xfl.controller;

import com.xfl.biz.UserBiz;
import com.xfl.dto.Response;
import com.xfl.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XFL
 * time on 2017/12/3 23:30
 * description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserBiz userBiz;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Response<UserVo> getUsers(){
        return userBiz.getUsers();
    }
}
