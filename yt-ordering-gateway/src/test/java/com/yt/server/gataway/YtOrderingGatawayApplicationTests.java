package com.yt.server.gataway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Base64;

@SpringBootTest
class YtOrderingGatawayApplicationTests {

    public static void main(String[] args) {
        String s = Base64.getEncoder().encodeToString("client_test:123456".getBytes());

        System.out.println(s);
    }

    @Test
    void contextLoads() {

    }

}
