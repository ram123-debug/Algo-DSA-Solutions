// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    var input = new int[] {5, 1, 4, 2};
    var expected = new int[] {8, 40, 10, 20};
    int[] actual = new Program().arrayOfProducts(input);
    Utils.assertTrue(expected.length == actual.length);
    for (int i = 0; i < actual.length; i++) {
      Utils.assertTrue(actual[i] == expected[i]);
    }
  }
}
