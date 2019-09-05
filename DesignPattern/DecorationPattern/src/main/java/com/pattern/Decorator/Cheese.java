package com.pattern.Decorator;

import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/13 0:25
 */
public class Cheese extends Condiment {

    public Pancake pancake;

    public Cheese(Pancake pancake)
    {
        super(pancake);
        this.pancake=pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc()+", 芝士";
    }

    @Override
    public double price() {
        return pancake.price()+8;
    }
}
