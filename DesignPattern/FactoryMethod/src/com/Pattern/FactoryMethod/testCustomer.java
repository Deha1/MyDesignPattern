package com.Pattern.FactoryMethod;

import com.Pattern.Product.Product;

/**
 * @author Ocean
 * @date 2019/6/17 0:49
 */
public class testCustomer {

    public static void main(String[] args) {

        Factory factoryA = new FactoryA();
        Factory factoryB = new FactoryB();
        Product productA = new FactoryA().createProduct();
        factoryB.createProduct();
    }

}
