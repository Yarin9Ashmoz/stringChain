package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;


public class Integration_B_C_Test {
    @Test
    public void testIntegration_1(){
        DStub stub = new DStub();
        C realC = new C(stub);
        B realB = new B(realC);

        String result = realB.process("H");
        assertEquals("HELL", result);
    }
}
