package com.myself.rpc.client;

import com.myself.rpc.Peer;
import com.myself.rpc.codec.Decoder;
import com.myself.rpc.codec.Encoder;
import com.myself.rpc.codec.JSONDecoder;
import com.myself.rpc.codec.JSONEncoder;
import com.myself.rpc.transport.HTTPTransportClient;
import com.myself.rpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @Description TODO
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
@Data
public class RpcClientConfig {

    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1",3000)
    );



}
