// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    int[] input = new int[] {2, 5, -3, -4, 6, 7, 2};
    int[] expected = new int[] {5, 6, 6, 6, 7, -1, 5};
    int[] actual = new Program().nextGreaterElement(input);
    assert (expected.equals(actual));
  }
}
