package com.Pattern.Context;

import com.Pattern.Strategy.Strategy;
import com.Pattern.Strategy.newCustomerStrategy;
import com.Pattern.Strategy.oldCustomerStrategy;

import java.math.BigDecimal;

/**
 * @author Ocean
 * @date 2019/6/19 23:30
 */
public class testCilent {

    public static void main(String[] args) {
        //1.创建老客户的报价策略
        Strategy strategy = new newCustomerStrategy();
        //2.创建报价上下文对象，并设置具体的报价策略
        Context context = new Context(strategy);
        //3.调用报价上下文的方法
        BigDecimal price = context.getPrice(new BigDecimal(20));

        System.out.println("折扣价为：" + price);
    }
}