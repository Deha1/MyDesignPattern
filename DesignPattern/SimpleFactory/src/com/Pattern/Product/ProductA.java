package com.Pattern.Product;

/**
 * @author Ocean
 * @date 2019/6/16 14:56
 */
public class ProductA implements Product{

    public ProductA(){
        ProductBmw();
    }

    @Override
    public void ProductBmw() {
        System.out.println("Producing---ProductA:BMW330");
    }
}
