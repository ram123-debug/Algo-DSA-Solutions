// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    int[] input = new int[] {5, 7, 1, 1, 2, 3, 22};
    int expected = 20;
    var actual = new Program().nonConstructibleChange(input);
    Utils.assertTrue(expected == actual);
  }
}
