package com.Pattern.Product;

/**
 * @author Ocean
 * @date 2019/6/16 14:56
 */
public class ProductC implements Product{

    public ProductC()
    {
        ProductBmw();
    }

    @Override
    public void ProductBmw() {
        System.out.println("Producing---ProductC:BMW730");
    }
}
