package com.pattern.Decorator;

import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/12 23:15
 */
public abstract class Condiment implements Pancake {

    public Pancake pancake;

    public Condiment(Pancake pancake)
    {
        this.pancake=pancake;
    }
    public double price() {
        return pancake.price();
    }

    public String getDesc()
    {
        return pancake.getDesc();
    }
}
