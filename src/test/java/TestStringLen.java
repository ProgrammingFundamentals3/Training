import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringLen {
    @Test
    void testStringLen() {
        StringLeng stringLeng = new StringLeng();
        String str = "hello";
        Assertions.assertEquals(5, stringLeng.getStringLen(str));
    }
}
