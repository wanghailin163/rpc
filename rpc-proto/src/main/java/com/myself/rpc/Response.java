package com.myself.rpc;

import lombok.Data;

/**
 * @Description 表示RPC的返回
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
@Data
public class Response {

    /**
     * 服务返回编码，0-成功，非0失败
     */
    private int code = 0;
    /**
     * 具体错误信息
     */
    private String message = "ok";
    /**
     * 返回的数据
     */
    private Object data;
}
