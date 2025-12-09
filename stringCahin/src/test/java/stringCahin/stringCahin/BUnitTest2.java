package stringCahin.stringCahin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BUnitTest2 {
    @Test
    public void testBWithStub() {   //this function is with an error
        CStub stub = new CStub();
        B b = new B(stub);
        String result = b.process("H");
        assertEquals("HEL", result);
    }

    @Test
    public void testBWithStub2(){   //this function is without an error
        CStub2 stub = new CStub2();
        B b = new B(stub);
        String result = b.process("H");
        assertEquals("HE",result);
    }
}
