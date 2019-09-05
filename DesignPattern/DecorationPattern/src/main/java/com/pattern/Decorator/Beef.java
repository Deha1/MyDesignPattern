package com.pattern.Decorator;

import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/12 23:41
 */
public class Beef extends Condiment {

    public Pancake pancake;

    public Beef(Pancake pancake) {
        super(pancake);
        this.pancake=pancake;
    }

    @Override
    public String getDesc() {
        return pancake.getDesc()+",牛肉";
    }

    @Override
    public double price() {
        return super.price()+10;
    }
}
