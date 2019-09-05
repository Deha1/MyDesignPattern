package com.Pattern.Decorator;

import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 10:55
 */
public class Shirt extends Decorator {

    public Shirt(Human human) {
        super(human);
    }

    public void wearShirt(){
        System.out.println("男孩穿上衬衫");
    }

    public void go()
    {
        System.out.println("男孩找到摩托车钥匙并出发");
    }
    @Override
    public void wearClothes() {
        super.wearClothes();
        wearShirt();
    }

    @Override
    public void goPlay() {
       super.goPlay();
        go();
    }
}
