package com.Pattern.FactoryMethod;

import com.Pattern.Product.Product;
import com.Pattern.Product.ProductB;

/**
 * @author Ocean
 * @date 2019/6/17 0:06
 */
public class FactoryB implements Factory{
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
