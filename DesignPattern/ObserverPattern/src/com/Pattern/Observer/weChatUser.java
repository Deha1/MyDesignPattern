package com.Pattern.Observer;

/**
 * @author Ocean
 * @date 2019/6/14 0:14
 */
public class weChatUser implements Observer{
    private String name;

    public weChatUser(String name)
    {
        this.name=name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"`s subscription:"+message);
    }
}
