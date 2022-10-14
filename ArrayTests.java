import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  //reverseInPlace tests
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void manyItemsReverseInPlace() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);//possibly not reversing
  }

  @Test
  public void twoItemsReverseInPlace() {//reverseInPlace() is not reversing
    int[] input1 = {1, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 1}, input1);
  }

  //reverse tests
  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void manyItemsReverse() {
    int [] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));//adding a integer 0 
  }

  @Test
  public void twoItemsReverse() {
    int [] input1 = {1, 5};
    assertArrayEquals(new int[] {5, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void oneZeroListReverse() {
    int [] input1 = {0};
    assertArrayEquals(new int[] {0}, ArrayExamples.reversed(input1));
  }

  //averageWithoutLowest tests
  @Test
  public void emptyList() {
    double [] input1 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0);
  }
}
