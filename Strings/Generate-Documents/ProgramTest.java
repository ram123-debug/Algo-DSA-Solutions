// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    String characters = "Bste!hetsi ogEAxpelrt x ";
    String document = "AlgoExpert is the Best!";
    boolean expected = true;
    var actual = new Program().generateDocument(characters, document);
    Utils.assertTrue(expected == actual);
  }
}
