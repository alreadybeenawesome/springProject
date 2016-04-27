package com.louis.dao;

import com.louis.entity.*;

/**
 * Created by test on 2016/4/21.
 */
public interface UserDao {
    int getMatchCount(String userName, String password);

    User findUserByUserName(String userName);

    void updateLoginInfo(User user);

}
