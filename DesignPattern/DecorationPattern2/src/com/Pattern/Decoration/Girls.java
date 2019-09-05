package com.Pattern.Decoration;

import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 10:32
 */
public class Girls implements Human {
    @Override
    public void wearClothes() {
        System.out.println("女孩开始穿衣服");

    }

    @Override
    public void goPlay() {
        System.out.println("女孩准备出去玩");
    }
}
