package com.Pattern.Decorator;

import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 10:42
 */
public class Jacket extends Decorator {

    public Jacket(Human human)
    {
        super(human);
    }

    public void wearJacket()
    {
        System.out.println("男孩穿上夹克");
    }

    public void Ready()
    {
        System.out.println("男孩找汽车钥匙");
    }

    @Override
    public void wearClothes() {
        super.wearClothes();
        wearJacket();
    }

    @Override
    public void goPlay() {
        super.goPlay();
        Ready();
    }
}
