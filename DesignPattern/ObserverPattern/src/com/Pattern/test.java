package com.Pattern;

import com.Pattern.Observer.Observer;
import com.Pattern.Observer.weChatUser;
import com.Pattern.Subject.Subject;
import com.Pattern.Subject.subscriptionSubject;

/**
 * @author Ocean
 * @date 2019/6/14 0:45
 */
public class test {

    public static void main(String[] args) {

        Observer user1 = new weChatUser("Jack");
        Observer user2 = new weChatUser("Tom");
        Observer user3 = new weChatUser("Kate");
        Subject sub= new subscriptionSubject();
        sub.attach(user1);
        sub.attach(user2);
        sub.attach(user3);
        sub.detach(user2);
        sub.notify("Master的专栏更新了");
    }
}
