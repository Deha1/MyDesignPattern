package com.Pattern.Subject;

import com.Pattern.Observer.Observer;

/**
 * @author Ocean
 * @date 2019/6/14 0:13
 */
public interface Subject {
    /**
     * 增加订阅者
     * @param observer
     */
    public void attach(Observer observer);
    /**
     * 删除订阅者
     * @param observer
     */
    public void detach(Observer observer);
    /**
     * 通知订阅者更新消息
     */
    public void notify(String message);

}
