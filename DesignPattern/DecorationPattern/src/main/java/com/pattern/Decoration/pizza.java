package com.pattern.Decoration;

import com.pattern.Interface.Pancake;

/**
 * @author Ocean
 * @date 2019/6/12 23:16
 */
public class pizza implements Pancake {

    public String desc;
    public pizza()
    {
        desc="披萨";
    }

    public String getDesc() {
        return desc;
    }

    public double price() {
        return 20;
    }
}
