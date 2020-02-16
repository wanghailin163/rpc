package com.myself.rpc.codec;

import com.alibaba.fastjson.JSON;

/**
 * @Description 基于json的反序列化实现
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
public class JSONDecoder implements Decoder{
    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes,clazz);
    }
}
