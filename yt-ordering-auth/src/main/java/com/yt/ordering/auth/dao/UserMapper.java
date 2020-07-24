package com.yt.ordering.auth.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.yt.ordering.auth.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author  liuxf
 * @date  2020/6/2 15:48
 * @version 1.0
 */
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectByUserName(@Param("userName")String userName);

}