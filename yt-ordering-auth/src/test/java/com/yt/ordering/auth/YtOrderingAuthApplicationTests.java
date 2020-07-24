package com.yt.ordering.auth;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@SpringBootTest
class YtOrderingAuthApplicationTests {
    @Autowired
    public PasswordEncoder passwordEncoder;
    @Test
    void contextLoads() {

        log.info(passwordEncoder.encode("123456"));

    }

}
