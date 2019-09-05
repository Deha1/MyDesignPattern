package com.Pattern.AbstractFactory;

import com.Pattern.AbstractProductA.Dough;
import com.Pattern.AbstractProductB.Condiments;

/**
 * @author Ocean
 * @date 2019/6/17 13:29
 */
public interface AbstractFactory {

    public Dough createDough();

    public Condiments createCondiments();

}
