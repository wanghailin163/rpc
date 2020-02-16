package com.myself.rpc.server;

import com.myself.rpc.Request;
import com.myself.rpc.common.utils.ReflectionUtils;

/**
 * @Description 调用具体服务
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
public class ServiceInvoker {

    public Object invoke(ServiceInstance service, Request request){
        return ReflectionUtils.invoke(service.getTarget(),service.getMethod(),request.getParamters());
    }
}
