package com.chaytech.api.user;

import com.chaytech.model.user.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * User-api
 *
 * @author chaytech@163.com
 * @date 2019/07/27 18:33
 */
@Component
@FeignClient(value = "USER-PROVIDER")
//@FeignClient(value = "USER-PROVIDER", fallback = UserFallBack.class)
//@FeignClient(value = "USER-PROVIDER", fallbackFactory = UserFallBackFactory.class)
public interface UserApi {

    @PostMapping("/user/createUser")
    public boolean createUser(@RequestBody UserEntity user);
//
    @GetMapping("/user/getUser/{id}")
    public UserEntity getUser(@PathVariable("id") Integer id);
//
    @GetMapping("/user/listUser")
    public List<UserEntity> listUser();

    @GetMapping("/feign/feignTimeout")
    public String feignTimeout();
}
