package com.yt.ordering.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 */
@EnableDiscoveryClient
@SpringBootApplication
public class YtOrderingAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(YtOrderingAuthApplication.class, args);
    }

}
