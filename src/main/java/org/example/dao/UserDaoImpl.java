package org.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * @Author Hcs
 * @Date 2021-7-16 20:35
 * @Version 1.0
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username = ?";
        jdbcTemplate.update(sql, 100, "hcs2");
    }

    //少钱
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username = ?";
        jdbcTemplate.update(sql, 100, "hcs");
    }
}