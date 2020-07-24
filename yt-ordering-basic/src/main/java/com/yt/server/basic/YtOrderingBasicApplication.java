package com.yt.server.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YtOrderingBasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtOrderingBasicApplication.class, args);
    }

}
