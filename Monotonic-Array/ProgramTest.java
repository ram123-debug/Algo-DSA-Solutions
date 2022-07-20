// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

class ProgramTest {
  @Test
  public void TestCase1() {
    var array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
    var expected = true;
    var actual = Program.isMonotonic(array);
    Utils.assertEquals(expected, actual);
  }
}
