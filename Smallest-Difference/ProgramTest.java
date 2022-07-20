// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.Arrays;

class ProgramTest {
  @Test
  public void TestCase1() {
    int[] expected = {28, 26};
    Utils.assertTrue(
        Arrays.equals(
            Program.smallestDifference(
                new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17}),
            expected));
  }
}
