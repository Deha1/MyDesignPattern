package com.Pattern.Product;

import com.Pattern.Builder.AbstractBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ocean
 * @date 2019/6/17 21:01
 */
public class Computer {

    //电脑组建的集合
    private List<String> parts = new ArrayList();

    //用于将组件组装到电脑中
    public void Add(String string)
    {
        parts.add(string);
    }

    public void show()
    {
        for (int i = 0; i <parts.size() ; i++) {
            System.out.println("组件"+parts.get(i)+"已经组装上了");
        }
        System.out.println("电脑组装完成，请验收");
    }



}
