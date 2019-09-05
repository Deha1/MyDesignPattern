package com.Pattern.Command;

/**
 * @author Ocean
 * @date 2019/6/18 11:37
 */
public interface Command {
    /**
     * * 执行命令
     */
    public void execute();

    /**
     * 撤销命令
     */
    public void undo();

}
