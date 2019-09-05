package com.pattern.Decorator;

import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/13 0:56
 */
public class tomato extends Condiment {

    public Pancake pancake;

    public tomato(Pancake pancake) {
        super(pancake);
        this.pancake=pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc()+",番茄";
    }

    @Override
    public double price() {
        return super.price()+3;
    }
}
