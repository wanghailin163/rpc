package com.myself.rpc.transport;

/**
 * 1.启动,监听
 * 2.接受请求
 * 3.关闭监听
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
public interface TransportServer {

    void init(int port,RequestHandler handler);

    void start();

    void stop();

}
