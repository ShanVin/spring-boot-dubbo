package com.shanvin.project.controller;

import com.shanvin.project.api.RPCService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @DubboReference
    private RPCService rpcService;

    @RequestMapping(value = "/sayhello", method = RequestMethod.GET)
    public String sayHello(String name) {
        return rpcService.sayHello(name);
    }

}
