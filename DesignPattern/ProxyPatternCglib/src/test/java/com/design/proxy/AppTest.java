package com.design.proxy;

import static org.junit.Assert.assertTrue;

import com.design.dao.UserDao;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Test
    public void ProxyTest() {

        UserDao userDao = new UserDao();

        UserDao userProxy = (UserDao)new ProxyFactory(userDao).getProxyInstance();

        userProxy.Change();


    }
}