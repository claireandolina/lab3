import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = {1,2,3,4,5};
    int[] input3 = {0,0};
    int[] input4 = {-2,1,7};
    int[] input5 = { };
    assertArrayEquals(new int[]{3}, ArrayExamples.reverseInPlace(input1));
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reverseInPlace(input2));
    assertArrayEquals(new int[]{0,0}, ArrayExamples.reverseInPlace(input3));
    assertArrayEquals(new int[]{7,1,-2}, ArrayExamples.reverseInPlace(input4));
    assertArrayEquals(new int[]{ }, ArrayExamples.reverseInPlace(input5));
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = {1,2,3,4,5};
    int[] input3 = {0,0};
    int[] input4 = {-2,1,7};
    int[] input5 = {1};
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{5,4,3,2,1}, ArrayExamples.reversed(input2));
    assertArrayEquals(new int[]{0,0}, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{7,1,-2}, ArrayExamples.reversed(input4));
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input5));
  }


  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { };
    double[] input2 = {1,1,1,1,1};
    double[] input3 = {0,0,4,5,6,9};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1),0);
    assertEquals(0, ArrayExamples.averageWithoutLowest(input2),0);
    assertEquals(4.8, ArrayExamples.averageWithoutLowest(input3),0);
  }
}