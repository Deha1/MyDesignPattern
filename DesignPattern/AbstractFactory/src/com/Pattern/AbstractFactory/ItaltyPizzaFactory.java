package com.Pattern.AbstractFactory;

import com.Pattern.AbstractProductA.Dough;
import com.Pattern.AbstractProductA.thinDough;
import com.Pattern.AbstractProductB.Condiments;
import com.Pattern.AbstractProductB.pepperoniCondi;

/**
 * @author Ocean
 * @date 2019/6/17 14:03
 */
public class ItaltyPizzaFactory implements AbstractFactory{

    public ItaltyPizzaFactory()
    {
        System.out.println("producing---ItaltyPizzaFactory");
    }

    @Override
    public Dough createDough() {
        return new thinDough();
    }

    @Override
    public Condiments createCondiments() {
        return new pepperoniCondi();
    }
}
