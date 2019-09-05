package com.Pattern.AbstractFactory;

import com.Pattern.AbstractProductA.Dough;
import com.Pattern.AbstractProductA.thickDough;
import com.Pattern.AbstractProductA.thinDough;
import com.Pattern.AbstractProductB.Condiments;
import com.Pattern.AbstractProductB.durianCondi;
import com.Pattern.AbstractProductB.pepperoniCondi;

/**
 * @author Ocean
 * @date 2019/6/17 14:03
 */
public class AmercianPizzaFactory implements AbstractFactory{

    public AmercianPizzaFactory()
    {
        System.out.println("producing---usaPizza");

    }


    @Override
    public Dough createDough() {
        return new thickDough();
    }

    @Override
    public Condiments createCondiments() {
        return new durianCondi();
    }
}
