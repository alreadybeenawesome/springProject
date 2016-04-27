package com.louis.dao.impl;

import com.louis.dao.UserDao;
import com.louis.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.*;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by test on 2016/4/21.
 */

@Repository
public class UserDaoImpl implements UserDao{


    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int getMatchCount(String userName, String password) {
        String sql ="select COUNT(0) from t_user where user_name=? and pwd=?";
        return jdbcTemplate.queryForInt(sql,new Object[]{userName,password});
    }

    public User findUserByUserName(final String userName) {
        String sql ="select * from t_user where user_name=?";
        final User user =new User();
        jdbcTemplate.query(sql, new Object[]{userName},
                new RowCallbackHandler() {
                    public void processRow(ResultSet resultSet) throws SQLException {
                        user.setUserId(resultSet.getInt("user_id"));
                        user.setUserName(userName);
                        user.setCredits(resultSet.getInt("credits"));
                    }
                }
        );
        return user;
    }

    public void updateLoginInfo(User user) {
        String sql ="UPDATE t_user set last_visit=?,last_ip=?,credits=? where user_id=?";
        jdbcTemplate.update(sql,new Object[]{user.getLastVisit(),user.getLastIp(),user.getCredits(),user.getUserId()});
    }
}
