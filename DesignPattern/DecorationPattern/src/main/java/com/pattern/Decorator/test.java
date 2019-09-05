package com.pattern.Decorator;

import com.pattern.Decoration.humberger;
import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/13 0:36
 */
public class test {

    public static void main(String[] args) {
        Pancake humberger = new humberger();
        System.out.println(String.format("%s ￥%s", humberger.getDesc(), humberger.price()));
        humberger=new Beef(humberger);
        humberger=new Cheese(humberger);
        humberger=new tomato(humberger);
        System.out.println(String.format("%s ￥%s", humberger.getDesc(), humberger.price()));
    }
}
