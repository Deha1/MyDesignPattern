package com.Pattern.Director;

import com.Pattern.Builder.AbstractBuilder;
import com.Pattern.Builder.ComputerBuilder;

/**
 * @author Ocean
 * @date 2019/6/17 21:01
 */
public class Director {

    //指挥装机人员组装电脑
    public void Construct(AbstractBuilder builder){

        builder.buildCpu();
        builder.buildMainboard();
        builder.buildMainframe();
        builder.buildIndicator();

    }


}
