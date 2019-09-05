package com.Pattern.FactoryMethod;

import com.Pattern.Product.Product;
import com.Pattern.Product.ProductA;

/**
 * @author Ocean
 * @date 2019/6/17 0:06
 */
public class FactoryA implements Factory{
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
