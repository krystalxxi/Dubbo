package com.demo.dubbo.client;

import com.demo.dubbo.client.consumer.InvokeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by Krystal on 2019/3/28.
 */
@SpringBootApplication
public class DubboClientApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DubboClientApplication.class, args);
        InvokeService service = context.getBean(InvokeService.class);
        System.out.println(service.hello.say("Anna"));
    }
}
