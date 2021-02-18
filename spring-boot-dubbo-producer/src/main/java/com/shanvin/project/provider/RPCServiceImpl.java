package com.shanvin.project.provider;

import com.shanvin.project.api.RPCService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class RPCServiceImpl implements RPCService {

    @Override
    public String sayHello(String name) {
        return name + " say Hello ...";
    }

}
