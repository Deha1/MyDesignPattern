package com.Pattern.Product;

/**
 * @author Ocean
 * @date 2019/6/16 14:56
 */
public class ProductB implements Product{
    public ProductB()
    {
        ProductBmw();
    }

    @Override
    public void ProductBmw() {
        System.out.println("Producing---ProductB:BMW530");
    }
}
