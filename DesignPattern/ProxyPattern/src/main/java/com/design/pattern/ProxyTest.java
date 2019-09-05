package com.design.pattern;

import com.design.Interface.Human;

import java.lang.reflect.Proxy;

/**
 * @author Ocean
 * @date 2019/6/12 20:21
 */
public class ProxyTest {
    public static void main(String[] args) {
        Human human = new Person();
        Human humanproxy = (Human)Proxy.newProxyInstance
                (
                        Human.class.getClassLoader(),
                        human.getClass().getInterfaces(),
                        new PersonProxy(human)
                );
        humanproxy.eating();
    }

}
