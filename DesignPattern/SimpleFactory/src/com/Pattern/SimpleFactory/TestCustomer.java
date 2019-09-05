package com.Pattern.SimpleFactory;

import com.Pattern.Product.Product;
import com.Pattern.Product.ProductA;

/**
 * @author Ocean
 * @date 2019/6/16 15:30
 */
public class TestCustomer {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product bmw330 = factory.createProduct(330);
        Product bmw530 = factory.createProduct(530);



    }
}
