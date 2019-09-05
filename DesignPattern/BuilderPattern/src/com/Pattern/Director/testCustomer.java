package com.Pattern.Director;

import com.Pattern.Builder.AbstractBuilder;
import com.Pattern.Builder.ComputerBuilder;
import com.Pattern.Product.Computer;

import java.util.Locale;

/**
 * @author Ocean
 * @date 2019/6/17 21:16
 */
public class testCustomer {

    public static void main(String[] args) {

        //逛了很久终于发现一家合适的电脑店
        //找到该店的老板和装机人员
        Director director = new Director();
        AbstractBuilder computerbuilder = new ComputerBuilder();

        //沟通需求后，老板叫装机人员去装电脑
        director.Construct(computerbuilder);
        //装完后，组装人员搬来组装好的电脑
        Computer computer = computerbuilder.getComputer();
        //组装人员展示电脑给顾客看
        computer.show();
    }



}
