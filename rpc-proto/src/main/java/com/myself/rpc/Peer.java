package com.myself.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description 表示网络传输的一个端点
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Peer {

    private String host;
    private int port;
}
