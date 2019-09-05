package com.pattern.Adapter;

import com.pattern.Interface.DBSocketInter;
import com.pattern.Interface.GBSocketInter;

/**
 * @author Ocean
 * @date 2019/6/13 22:50
 */
public class SocketAdapter implements DBSocketInter {
//适配器必须实现旧的接口
    private GBSocketInter socket;
//必须有新接口的属性
    public  SocketAdapter(GBSocketInter socket)
    {
        this.socket=socket;
    }
    @Override
    public void roundSocket() {
        socket.flatSocket();
    }

    //供的是德国电，插的是中国插座,等于在德国的插座上插了一个新的中国插座
}
