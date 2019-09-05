package com.pattern.Entity;

import com.pattern.Adapter.SocketAdapter;
import com.pattern.Interface.DBSocketInter;
import com.pattern.Interface.GBSocketInter;

/**
 * @author Ocean
 * @date 2019/6/13 23:16
 */
public class test {

    public static void main(String[] args) {
        GBSocketInter gbSocket=new GBSocket();

        Hotel hotel=new Hotel();

        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        hotel.setSocket(socketAdapter);

        hotel.Charge();
        //
    }


}
