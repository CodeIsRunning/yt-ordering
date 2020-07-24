package com.yt.server.basic.controller;

import common.constants.ResultCommonV2;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OrderController
 *
 * @author liuxf
 */
@Slf4j
@RestController
@RequestMapping
@Api(tags = "1、测试", position = 1)
public class OrderController {


    @GetMapping(value = "get")
    @ApiOperation(value = "1、测试接口", httpMethod = "GET", position = 1)
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResultCommonV2 get() {
        log.info("test");
        return ResultCommonV2.successfulResult("test");
    }

    @GetMapping(value = "test")
    //@PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public ResultCommonV2 get1() {
        return ResultCommonV2.successfulResult("test2");
    }
}
