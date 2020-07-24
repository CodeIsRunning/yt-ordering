package com.yt.ordering.auth.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.yt.ordering.auth.dao.UserMapper;
import com.yt.ordering.auth.model.User;
import com.yt.ordering.auth.service.UserService;

import java.util.List;

/**
 * @author  liuxf
 * @date  2020/6/2 15:48
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<User> selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }
}
