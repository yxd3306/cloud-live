package com.cloud.live.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: 喻湘东
 * @Email: Jyxd1997@163.com
 * @Date: 2019-06-04 11:31:39
 * @Description: eureka注册中心启动类
 */

@SpringBootApplication
@EnableEurekaServer
public class RegisterServerApp {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServerApp.class,args);
    }

}
