package com.myself.rpc.codec;

/**
 * @Description 反序列化  二进制数组 -> 对象
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
public interface Decoder {

    <T> T decode(byte[] bytes,Class<T> clazz);
}
