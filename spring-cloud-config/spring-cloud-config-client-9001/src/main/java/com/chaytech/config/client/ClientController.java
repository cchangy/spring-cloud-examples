package com.chaytech.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chaytech@163.com
 * @date 2019/07/31 22:25
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中
public class ClientController {

    @Value("${profiles}")
    private String profiles;

    @GetMapping("/profiles")
    public String profiles() {
        return this.profiles;
    }
}
