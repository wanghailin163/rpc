package com.myself.rpc.client;

import com.myself.rpc.Peer;
import com.myself.rpc.transport.TransportClient;

import java.util.List;

/**
 * @Description 表示选择哪个server去连接
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
public interface TransportSelector {

    /**
     * 初始化selector
     * @param peers 可以连接的server端点信息
     * @param count client与server建立多少个连接
     * @param clazz client实现class
     */
    void init(List<Peer> peers,int count,Class<? extends TransportClient> clazz);

    /**
     * 选择一个transport和server做交互
     * @return 网络client
     */
    TransportClient select();

    /**
     * 释放用完的client
     * @param client
     */
    void release(TransportClient client);

    void close();

}
