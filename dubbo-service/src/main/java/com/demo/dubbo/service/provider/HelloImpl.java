package com.demo.dubbo.service.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.dubbo.api.IHello;

/**
 * Created by Krystal on 2019/3/28.
 */
@Service(mock = "com.demo.dubbo.api.IHelloMock")
public class HelloImpl implements IHello {

    public String say(String msg){
//        try{
//            Thread.sleep(10*1000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        System.out.println("你好：" + msg);
        return msg;
    }
}
