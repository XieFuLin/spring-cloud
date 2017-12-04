package com.xfl.client;

import com.xfl.dto.Response;
import com.xfl.vo.UserVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by XFL
 * time on 2017/12/3 22:56
 * description:
 */
@FeignClient(value = "user-service")
@RequestMapping(value = "/user-service")
public interface UserClient {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    Response<UserVo> getUsers();
}
