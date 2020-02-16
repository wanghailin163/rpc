package com.myself.rpc.codec;


import org.junit.Test;
import static org.junit.Assert.*;

public class JSONDecoderTest {


    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();
        TestBean testBean = new TestBean();
        testBean.setName("whl");
        testBean.setAge(28);

        byte[] bytes = encoder.encode(testBean);

        Decoder decoder = new JSONDecoder();
        TestBean testBean2 = decoder.decode(bytes, TestBean.class);
        assertEquals(testBean.getName(),testBean2.getName());
        assertEquals(testBean.getAge(),testBean2.getAge());

    }
}
