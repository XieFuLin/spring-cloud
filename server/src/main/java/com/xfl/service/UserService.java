package com.xfl.service;

import com.xfl.client.UserClient;
import com.xfl.dto.Response;
import com.xfl.vo.UserVo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by XFL
 * time on 2017/12/3 23:22
 * description:
 */
@RestController
public class UserService implements UserClient{
    @Override
    public Response<UserVo> getUsers(){
        Response<UserVo> response = new Response<UserVo>();
        response.setCode(1000);
        response.setMsg("success");
        UserVo userVo = new UserVo("Test");
        response.setData(userVo);
        return response;
    }
}
