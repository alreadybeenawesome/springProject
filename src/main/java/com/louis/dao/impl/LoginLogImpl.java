package com.louis.dao.impl;

import com.louis.dao.LoginLogDao;
import com.louis.entity.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by test on 2016/4/25.
 */

@Repository
public class LoginLogImpl implements LoginLogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog log) {
        String sql ="insert into t_login_log (user_id,ip,login_datetime) values(?,?,?)";
        Object[] args ={log.getUserId(),log.getIp(),log.getLoginDate()};
        jdbcTemplate.update(sql,args);
    }
}
