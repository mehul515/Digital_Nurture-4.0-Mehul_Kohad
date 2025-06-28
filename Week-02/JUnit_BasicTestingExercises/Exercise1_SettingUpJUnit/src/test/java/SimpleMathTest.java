import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleMathTest {
    @Test
    public void testAdd() {
        SimpleMath math = new SimpleMath();
        int result = math.add(2, 3);
        assertEquals(5, result);
    }
}
