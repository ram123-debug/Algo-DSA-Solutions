// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.Arrays;

class ProgramTest {
  @Test
  public void TestCase1() {
    int[] expected = {3, 9};
    Utils.assertTrue(
        Arrays.equals(
            Program.subarraySort(new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19}),
            expected));
  }
}
