package com.Pattern.Decorator;

import com.Pattern.Decoration.Boys;
import com.Pattern.Interface.Human;

/**
 * @author Ocean
 * @date 2019/6/13 11:06
 */
public class test {
    public static void main(String[] args) {

        Human boys = new Boys();
//        Shirt s =new Shirt(boys);
//        Jeans j =new Jeans(s);
//        j.wearClothes();
//        j.goPlay();

        //boys=new Shirt(new Jeans(boys));
        boys  = new Shirt(boys);
        boys=new Jeans(boys);
        boys.wearClothes();
        boys.goPlay();
    }
}
