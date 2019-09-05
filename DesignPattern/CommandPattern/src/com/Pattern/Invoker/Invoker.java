package com.Pattern.Invoker;

import com.Pattern.Command.Command;

/**
 * @author Ocean
 * @date 2019/6/18 11:39
 */
public class Invoker {

    /**
     * 调用者持有命令对象
     */

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void doCommand()
    {
        command.execute();
    }

    public void  undoCommand()
    {
        command.undo();
    }

}
