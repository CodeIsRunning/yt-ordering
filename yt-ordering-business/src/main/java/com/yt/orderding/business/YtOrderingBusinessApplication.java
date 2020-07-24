package com.yt.orderding.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YtOrderingBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtOrderingBusinessApplication.class, args);
    }

}
