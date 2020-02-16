package com.myself.rpc.server;

import com.myself.rpc.Request;
import com.myself.rpc.Response;
import com.myself.rpc.codec.Decoder;
import com.myself.rpc.codec.Encoder;
import com.myself.rpc.common.utils.ReflectionUtils;
import com.myself.rpc.transport.RequestHandler;
import com.myself.rpc.transport.TransportServer;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Description TODO
 * @Author wanghailin
 * @Date 2020/02/16
 * @Version 1.0
 */
@Slf4j
public class RpcServer {


    private RpcServerConfig config;
    private TransportServer net;
    private Encoder encoder;
    private Decoder decoder;
    private ServiceManager serviceManager;
    private ServiceInvoker serviceInvoker;

    public RpcServer(){
        this(new RpcServerConfig());
    }

    public RpcServer(RpcServerConfig config) {
        this.config = config;
        //net
        this.net = ReflectionUtils.newInstance(config.getTransportClass());
        this.net.init(config.getPort(),this.handler);
        //codec
        this.encoder = ReflectionUtils.newInstance(config.getEncoderClass());
        this.decoder = ReflectionUtils.newInstance(config.getDecoderClass());
        //service
        this.serviceManager = new ServiceManager();
        this.serviceInvoker = new ServiceInvoker();
    }

    public <T> void register(Class<T> interfaceClass,T bean){
        serviceManager.register(interfaceClass,bean);
    }

    public void start(){
        this.net.start();
    }

    public void stop(){
        this.net.stop();
    }

    private RequestHandler handler = ((recive, toResp) -> {
        Response resp = new Response();
        try {
            byte[] inBytes = IOUtils.readFully(recive,recive.available());
            Request request = decoder.decode(inBytes,Request.class);
            log.info("get request: {}", request);

            ServiceInstance sis = serviceManager.lookup(request);
            Object ret = serviceInvoker.invoke(sis,request);
            resp.setData(ret);
        } catch (Exception e) {
            log.warn(e.getMessage(),e);
            resp.setCode(1);
            resp.setMessage("RpcServer got error: " + e.getClass().getName() + ":" + e.getMessage());
        }finally {
            try {
                byte[] outBytes = encoder.encode(resp);
                toResp.write(outBytes);
                log.info("response client");
            } catch(Exception e) {
                log.warn(e.getMessage(),e);
            }
        }
    });


}
