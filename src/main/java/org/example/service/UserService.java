package org.example.service;

import org.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Hcs
 * @Date 2021-7-16 20:34
 * @Version 1.0
 */
@Service
@Transactional()
public class UserService {

//    注入dao
    @Autowired
    private UserDao userDao;


//    转账的方法
    public void accountMoney(){
        //try {
            //第一步 开启事务

            //第二步 进行业务操作

            //hcs少100
            userDao.reduceMoney();

            //    模拟异常
            int i = 10 / 0;

            //    hcs2多100
            userDao.addMoney();
        //    第三步 没有发生异常，提交事务
        //}catch (Exception e){
        ////        第四步 出现异常，事务回滚
        //
        //}

    }
}