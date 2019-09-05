package com.pattern.Entity;

import com.pattern.Interface.DBSocketInter;

/**
 * @author Ocean
 * @date 2019/6/13 22:57
 */
public class DBSocket implements DBSocketInter {
    @Override
    public void roundSocket() {
        System.out.println("德国两项圆头插座");
    }
}
