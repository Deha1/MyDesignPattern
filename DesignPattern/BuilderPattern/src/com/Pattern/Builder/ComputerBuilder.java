package com.Pattern.Builder;

import com.Pattern.Product.Computer;

/**
 * @author Ocean
 * @date 2019/6/17 20:59
 */
public class ComputerBuilder extends AbstractBuilder {

    Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.Add("cpu");
    }

    @Override
    public void buildMainboard() {
        computer.Add("主板");
    }

    @Override
    public void buildMainframe() {
        computer.Add("主机");
    }

    @Override
    public void buildIndicator() {
        computer.Add("显示屏");
    }


    @Override
    public Computer getComputer() {
        return computer;
    }
}
