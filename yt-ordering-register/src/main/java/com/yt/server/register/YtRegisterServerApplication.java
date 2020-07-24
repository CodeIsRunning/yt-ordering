package com.yt.server.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YtRegisterServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtRegisterServerApplication.class, args);
    }

}
