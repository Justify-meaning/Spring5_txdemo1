package org.example;

import org.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Hcs
 * @Date 2021-7-12 20:03
 * @Version 1.0
 */
public class TestBook {

    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("datasource.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}