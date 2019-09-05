package com.Pattern.client;

import com.Pattern.Prototype.ConcretePrototype;

/**
 * @author Ocean
 * @date 2019/6/25 0:33
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for(int i=0; i< 5; i++){
            ConcretePrototype clonecp = (ConcretePrototype)concretePrototype.clone();
            clonecp.show();
        }


    }

}
