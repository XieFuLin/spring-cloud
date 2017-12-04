package com.xfl.biz;

import com.xfl.client.UserClient;
import com.xfl.dto.Response;
import com.xfl.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XFL
 * time on 2017/12/3 23:32
 * description:
 */
@Service
public class UserBiz {
    @Autowired
    private UserClient userClient;
    public Response<UserVo> getUsers(){
        return userClient.getUsers();
    }
}
