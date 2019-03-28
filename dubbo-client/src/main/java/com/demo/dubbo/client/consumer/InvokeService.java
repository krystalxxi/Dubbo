package com.demo.dubbo.client.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.api.IHello;
import org.springframework.stereotype.Component;

/**
 * Created by Krystal on 2019/3/28.
 * 远程调用Dubbo服务端
 */
@Component
public class InvokeService {
    @Reference(mock = "return null")
    public IHello hello;

}
