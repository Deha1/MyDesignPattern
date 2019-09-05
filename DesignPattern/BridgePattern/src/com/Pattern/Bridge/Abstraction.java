package com.Pattern.Bridge;

import com.Pattern.Implentor.Implmentor;
import com.Pattern.Implentor.MysqlImp;

/**
 * @author Ocean
 * @date 2019/6/20 22:56
 */
public abstract class Abstraction {
    private Implmentor implmentor;

    public void setImplmentor(Implmentor implmentor) {
        this.implmentor = implmentor;
    }

    public Implmentor getImplmentor() {
        return implmentor;
    }

    public abstract void doConvert();

}
