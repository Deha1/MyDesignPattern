package com.pattern.Entity;

import com.pattern.Interface.DBSocketInter;

/**
 * @author Ocean
 * @date 2019/6/13 23:16
 */
public class Hotel {

    private DBSocketInter dbSocket;

    public Hotel()
    {

    }

    public Hotel(DBSocketInter dbSocket){
        this.dbSocket=dbSocket;
    }

    public void setSocket(DBSocketInter dbSocket)
    {
        this.dbSocket=dbSocket;
    }

    //宾馆是德国插座
    public void Charge()
    {
        dbSocket.roundSocket();
    }

}
