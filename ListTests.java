import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {

    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("Aurelio");
        input1.add("Apple");
        List<String> input1Compare = new ArrayList<>();
        input1Compare.add("Apple");
        ListExamples test = new ListExamples(1);

        assertEquals(input1Compare, ListExamples.filter(input1, test));
    }
}