package week8.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    /*@Test
    public void exercise3() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(15);
        Box<ArrayList<Integer>> boxWithList = new Box<>(list);
        String expected = "1, 3, 15";
        assertEquals(expected,
                boxWithList.apply(element -> element.sort((x, y) -> x.compareTo(y))));

    }*/

    @Test
    public void exercise4() {
        List<String> list = new ArrayList<>();
        list.add("Ciao");
        list.add("Come");
        list.add("Stai");

        Box<List<String>> boxWithList = new Box<>(list);
        Integer result = boxWithList.apply(element -> element.stream().mapToInt(String::length).sum());
        assertEquals(12, result);
    }
}
