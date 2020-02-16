package com.myself.rpc.server;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Method;

/**
 * @Description 表示具体的一个服务
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class ServiceInstance {

    private Object target;
    private Method method;
}
