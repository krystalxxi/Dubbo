package com.demo.dubbo.service.mock;

import com.demo.dubbo.api.IHello;

/**
 * Created by Krystal on 2019/3/28.
 */
public class IHelloMock implements IHello {
    public String say(String msg) {
        return "降级数据";
    }

}
