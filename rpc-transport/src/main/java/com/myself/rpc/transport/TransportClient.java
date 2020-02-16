package com.myself.rpc.transport;

import com.myself.rpc.Peer;

import java.io.InputStream;

/**
 * 1.创建连接
 * 2.发送数据，并且等待响应
 * 3.关闭连接
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
public interface TransportClient {

    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
