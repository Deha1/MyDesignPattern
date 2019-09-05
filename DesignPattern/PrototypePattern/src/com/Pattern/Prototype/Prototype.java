package com.Pattern.Prototype;

/**
 * @author Ocean
 * @date 2019/6/24 21:05
 */
public class Prototype implements Cloneable{

    public Prototype clone()
    {
        Prototype prototype = null;
        try{

            prototype = (Prototype)super.clone();

        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return prototype;

    }

}
