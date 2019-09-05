package com.Pattern.Bridge;

/**
 * @author Ocean
 * @date 2019/6/20 22:58
 */
public class txtConvert extends Abstraction{

    @Override
    public void doConvert() {
        getImplmentor().selectMethod();
        System.out.println("转化成txt格式");

    }
}
