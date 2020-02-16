package com.myself.rpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description 处理网络请求的handler
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
public interface RequestHandler {

    void onRequest(InputStream recive, OutputStream toResp);

}
