package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class Integration_A_B_Test {
    @Test
    public void testIntegration_1(){
        CStub stub = new CStub();
        B realB = new B(stub);
        A realA = new A(realB);

        String result = realA.process("");
        assertEquals("HEL", result);
    }
}
