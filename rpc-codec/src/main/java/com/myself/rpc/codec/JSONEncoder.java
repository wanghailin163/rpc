package com.myself.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @Description 基于json的序列化实现
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
public class JSONEncoder implements Encoder {
    @Override
    public byte[] encode(Object obj) {
        //把一个对象转成json字符串的byte数组
        return JSON.toJSONBytes(obj);
    }
}
