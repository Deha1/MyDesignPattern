package com.Pattern.Decoration;

import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 10:29
 */
public class Boys implements Human {
    @Override
    public void wearClothes() {
        System.out.println("男孩开始穿衣服");
    }

    @Override
    public void goPlay() {
        System.out.println("男孩准备出门去玩");
    }
}
