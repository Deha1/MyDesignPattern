package com.Pattern.Decorator;

import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 10:35
 */
public abstract class Decorator implements Human {

    public Human human;

    public Decorator(Human human)
    {
        this.human=human;
    }

    @Override
    public void wearClothes() {
        human.wearClothes();
    }

    @Override
    public void goPlay() {
        human.goPlay();
    }
}
