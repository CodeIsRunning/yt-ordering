package com.yt.ordering.auth.service.impl;


import com.yt.ordering.auth.constans.RedisConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 资源与角色匹配关系管理业务类
 * @author
 */
@Service
public class ResourceServiceImpl {

    private Map<String, List<String>> resourceRolesMap;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @PostConstruct
    public void initData() {
        // TODO: 2020/7/22 从数据库获取
        resourceRolesMap = new TreeMap<>();
        resourceRolesMap.put("/api/hello", Arrays.asList("ADMIN"));
        resourceRolesMap.put("/api/user/currentUser", Arrays.asList("ADMIN", "TEST"));
        redisTemplate.opsForHash().putAll(RedisConstant.RESOURCE_ROLES_MAP, resourceRolesMap);
    }
}
