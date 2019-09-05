package com.pattern.Decoration;

import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/12 23:16
 */
public class humberger implements Pancake {

    public String desc;

    public humberger()
    {
        desc="汉堡";
    }

    public String getDesc() {
        return desc;
    }

    public double price() {
        return 10;
    }
}
