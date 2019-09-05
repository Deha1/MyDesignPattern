package com.Pattern.Subject;

import com.Pattern.Observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ocean
 * @date 2019/6/14 0:14
 */
public class subscriptionSubject implements Subject {

    //储存订阅公众号的微信用户
    private List<Observer> weChatUserList= new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weChatUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weChatUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for(Observer observer:weChatUserList)
        {
            observer.update(message);
        }
    }
}
