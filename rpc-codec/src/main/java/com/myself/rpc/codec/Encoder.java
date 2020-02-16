package com.myself.rpc.codec;

/**
 * @Description 序列化   对象 -> 二进制数组
 * @Author wanghailin
 * @Date 2020/02/15
 * @Version 1.0
 */
public interface Encoder {

    byte[] encode(Object obj);
 }
