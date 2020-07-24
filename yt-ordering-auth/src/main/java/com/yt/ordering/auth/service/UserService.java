package com.yt.ordering.auth.service;
import java.util.List;

import com.yt.ordering.auth.model.User;
    /**
 * @author  liuxf
 * @date  2020/6/2 15:48
 * @version 1.0
 */
public interface UserService{


    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);



	List<User> selectByUserName(String userName);


}
