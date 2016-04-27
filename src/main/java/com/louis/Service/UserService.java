package com.louis.Service;

import com.louis.entity.User;

/**
 * Created by test on 2016/4/25.
 */
public interface UserService {
    boolean hasMatchUser(String userName,String password);

    User findUserByUserName(String userName);

    void loginSuccess(User user);
}
