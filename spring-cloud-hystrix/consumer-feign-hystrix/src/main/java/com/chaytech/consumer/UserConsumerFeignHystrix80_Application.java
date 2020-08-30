package com.chaytech.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Chency
 * @email chaytech@163.com
 * @Date: 2019/07/06 20:58
 */
@SpringBootApplication
// 本服务启动后会自动注册进eureka服务中
//@EnableEurekaClient
//@EnableFeignClients(basePackages = {"com.chaytech.**"})
//@ComponentScan(basePackages = {"com.chaytech.**"})
public class UserConsumerFeignHystrix80_Application {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerFeignHystrix80_Application.class,args);
    }
}
