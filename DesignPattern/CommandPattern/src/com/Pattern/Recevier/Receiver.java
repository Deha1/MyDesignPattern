package com.Pattern.Recevier;

/**
 * @author Ocean
 * @date 2019/6/18 11:38
 */
public class Receiver {
    /**
     * 命令接收者,命令真正执行人
     */


    public void action(){

        System.out.println("doAction");
    }

    public void unaction()
    {

        System.out.println("undoAction");
    }
}
