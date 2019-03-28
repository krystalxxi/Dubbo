package com.demo.dubbo.gateway.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.api.IHello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Krystal on 2019/3/28.
 */
@RestController
public class RpcController {
    @Reference(mock = "true")
    private IHello hello;
    @RequestMapping(value = "/")
    public String say(){
        return hello.say("rpc");
    }
}
