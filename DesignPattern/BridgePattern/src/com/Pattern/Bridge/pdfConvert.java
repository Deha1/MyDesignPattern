package com.Pattern.Bridge;

/**
 * @author Ocean
 * @date 2019/6/20 22:57
 */
public class pdfConvert extends Abstraction{

    @Override
    public void doConvert() {
        getImplmentor().selectMethod();
        System.out.println("转化成pdf格式");
    }
}
