package com.Pattern.SimpleFactory;

import com.Pattern.Product.Product;
import com.Pattern.Product.ProductA;
import com.Pattern.Product.ProductB;
import com.Pattern.Product.ProductC;

import java.lang.reflect.Type;

/**
 * @author Ocean
 * @date 2019/6/16 14:56
 */
public class Factory {

    public Product createProduct(int type)
    {
        switch (type)
        {
            case 330:
                return new ProductA();
            case 530:
                return new ProductB();
            case 730:
                return new ProductC();
            default:
                break;
        }

        return null;
    }
}
