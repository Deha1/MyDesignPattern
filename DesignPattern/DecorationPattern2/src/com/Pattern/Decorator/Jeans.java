package com.Pattern.Decorator;

import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 10:50
 */
public class Jeans extends Decorator {

    public Jeans(Human human)
    {
        super(human);
    }

    public void wearJeans()
    {
        System.out.println("男孩穿上牛仔裤");
    }
    public void drive()
    {
        System.out.println("男孩开车出去");
    }


    @Override
    public void wearClothes() {
        super.wearClothes();
        wearJeans();
    }

    @Override
    public void goPlay() {
        super.goPlay();
        drive();
    }
}
