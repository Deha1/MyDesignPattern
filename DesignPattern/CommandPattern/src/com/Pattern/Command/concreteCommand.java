package com.Pattern.Command;

import com.Pattern.Recevier.Receiver;

/**
 * @author Ocean
 * @date 2019/6/18 11:38
 */
public class concreteCommand implements Command{

    //命令要求的功能的真正实现者
    private Receiver receiver;

    public concreteCommand(Receiver receiver)
    {
        this.receiver=receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.unaction();
    }
}
