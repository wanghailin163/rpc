package com.myself.rpc.codec;


import org.junit.Test;
import static org.junit.Assert.assertNotNull;


public class JSONEncoderTest {


    @Test
    public void decode() {
        Encoder encoder = new JSONEncoder();
        TestBean testBean = new TestBean();
        testBean.setName("whl");
        testBean.setAge(28);

        byte[] bytes = encoder.encode(testBean);
        assertNotNull(bytes);

    }
}
