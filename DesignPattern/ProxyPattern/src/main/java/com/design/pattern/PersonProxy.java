package com.design.pattern;

import com.design.aspect.PersonAspect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Ocean
 * @date 2019/6/12 20:13
 */
public class PersonProxy implements InvocationHandler {

    Object object;
    public PersonProxy(Object object)
    {
        this.object=object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("保姆做饭");
        PersonAspect.logbefore();
        Object result = method.invoke(object,args);
        PersonAspect.logafter();
        System.out.println("洗碗机洗碗");

        return null;
    }


}
