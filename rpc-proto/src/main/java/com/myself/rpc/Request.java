package com.myself.rpc;

import lombok.Data;

/**
 * @Description 表示RPC的一个请求
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
@Data
public class Request {

    private ServiceDescriptor service;
    private Object[] paramters;


}
