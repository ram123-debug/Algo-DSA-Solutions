// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    var input = "AAAAAAAAAAAAABBCCCCDD";
    var expected = "9A4A2B4C2D";
    var actual = new Program().runLengthEncoding(input);
    Utils.assertTrue(expected.equals(actual));
  }
}
