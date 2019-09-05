package com.Pattern.AbstractFactory;

/**
 * @author Ocean
 * @date 2019/6/17 14:09
 */
public class testCustomer {

    public static void main(String[] args) {

        AbstractFactory italtyPizza = new ItaltyPizzaFactory();
        italtyPizza.createDough();
        italtyPizza.createCondiments();

    }

}
