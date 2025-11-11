package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testBWithStub(){
        CStub stub = new CStub();
        B b = new B(stub);
        String result = b.process("H");
        assertEquals("HEL",result);
    }

}
