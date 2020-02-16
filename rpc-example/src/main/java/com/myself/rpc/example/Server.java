package com.myself.rpc.example;

import com.myself.rpc.server.RpcServer;
import com.myself.rpc.server.RpcServerConfig;

/**
 * @Description TODO
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
public class Server {

    public static void main(String[] args){
        RpcServer server = new RpcServer();
        server.register(CalcService.class,new CalcServiceImpl());
        server.start();
    }

}
