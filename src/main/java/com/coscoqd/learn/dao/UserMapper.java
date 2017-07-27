package com.coscoqd.learn.dao;

import com.coscoqd.learn.model.User;

/**
 * Created by baiguantao on 2017/5/22.
 */
public interface UserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}
