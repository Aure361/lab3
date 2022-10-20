import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("aurelio");
        input1.add("zero");
        List<String> input1Compare = new ArrayList<>();
        input1Compare.add("apple");

        assertEquals(input1Compare, ListExamples.filter(input1, new ListExamples()));
    }
}