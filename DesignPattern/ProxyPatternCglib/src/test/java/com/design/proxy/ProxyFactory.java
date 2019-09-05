package com.design.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Ocean
 * @date 2019/8/21 11:09
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target)
    {
        this.target=target;
    }

    public Object getProxyInstance()
    {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(target.getClass());

        enhancer.setCallback(this);

        return enhancer.create();


    }


    public Object intercept(Object object, Method method, Object []args, MethodProxy proxy) throws InvocationTargetException, IllegalAccessException {

        System.out.println("开始事务...");

        Object returnValue=method.invoke(target,args);

        System.out.println("提交事务...");

        return returnValue;

    }





}
