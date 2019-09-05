package com.Pattern.Builder;

import com.Pattern.Product.Computer;

/**
 * @author Ocean
 * @date 2019/6/17 20:53
 */
public abstract class AbstractBuilder {

    //第一步：装CPU
    //声明为抽象方法，具体由子类实现
    public abstract void buildCpu();

    //第二步：装主板
    //声明为抽象方法，具体由子类实现
    public abstract void buildMainboard();

    public abstract void buildMainframe();

    public abstract void buildIndicator();

    //返回产品的方法：获得组装好的电脑
    public abstract Computer getComputer();

}
