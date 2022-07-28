// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    var input = new int[] {2, 1, 5, 2, 3, 3, 4};
    var expected = 2;
    var actual = new Program().firstDuplicateValue(input);
    Utils.assertTrue(expected == actual);
  }
}
