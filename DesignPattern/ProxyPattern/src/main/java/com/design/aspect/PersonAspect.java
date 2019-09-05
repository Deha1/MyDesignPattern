package com.design.aspect;

/**
 * @author Ocean
 * @date 2019/6/12 20:08
 */
public class PersonAspect {
    public static void logbefore()
    {
        System.out.println("做饭中");
    }
    public static void logafter()
    {
        System.out.println("工作中");
    }
}
