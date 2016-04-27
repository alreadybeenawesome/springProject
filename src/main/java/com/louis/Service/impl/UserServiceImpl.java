package com.louis.Service.impl;

import com.louis.Service.UserService;
import com.louis.dao.LoginLogDao;
import com.louis.dao.UserDao;
import com.louis.entity.LoginLog;
import com.louis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by test on 2016/4/25.
 */


@Service  //将UserServiceImpl标注为一个服务层的Bean
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private LoginLogDao loginLogDao;


    public boolean hasMatchUser(String userName, String password) {
        int matchCount =userDao.getMatchCount(userName,password);
        return matchCount>0;
    }

    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }

    public void loginSuccess(User user) {
        user.setCredits(5+user.getCredits());
        LoginLog loginLog =new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());
        userDao.updateLoginInfo(user);
        loginLogDao.insertLoginLog(loginLog);
    }
}
