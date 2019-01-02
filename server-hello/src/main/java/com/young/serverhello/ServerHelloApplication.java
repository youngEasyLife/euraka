package com.young.serverhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient      // @ EnableEurekaClient   表示申明自己是一个发服务提供者;
@SpringBootApplication
public class ServerHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerHelloApplication.class, args);
    }

}

