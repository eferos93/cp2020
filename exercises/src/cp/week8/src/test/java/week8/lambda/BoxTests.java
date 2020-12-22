package week8.lambda;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoxTests {

    final Box<Integer> box = new Box<>(10);
    @Test
    public void test() {
        assertEquals(10, box.content());
    }

    @Test
    public void testBoxFunction() {
        assertEquals("10", box.apply(element -> Integer.toString(element)));
    }

}
