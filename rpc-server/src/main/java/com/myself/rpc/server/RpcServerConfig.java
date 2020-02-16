package com.myself.rpc.server;

import com.myself.rpc.codec.Decoder;
import com.myself.rpc.codec.Encoder;
import com.myself.rpc.codec.JSONDecoder;
import com.myself.rpc.codec.JSONEncoder;
import com.myself.rpc.transport.HTTPTransportServer;
import com.myself.rpc.transport.TransportServer;
import lombok.Data;

/**
 * @Description server配置
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
@Data
public class RpcServerConfig {

    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;

}
