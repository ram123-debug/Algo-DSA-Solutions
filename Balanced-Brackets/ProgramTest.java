// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

class ProgramTest {
  @Test
  public void TestCase1() {
    String input = "([])(){}(())()()";
    Utils.assertTrue(Program.balancedBrackets(input));
  }
}
