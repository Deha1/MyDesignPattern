package com.Pattern.Bridge;

import com.Pattern.Implentor.Implmentor;
import com.Pattern.Implentor.OracleImp;

/**
 * @author Ocean
 * @date 2019/6/20 23:15
 */
public class testCilent {

    public static void main(String[] args) {

        Implmentor implmentor = new OracleImp();
        Abstraction abstraction = new pdfConvert();
        abstraction.setImplmentor(implmentor);
        abstraction.doConvert();

    }

}
