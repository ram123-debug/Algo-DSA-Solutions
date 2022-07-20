// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    List<Integer> array = new ArrayList<Integer>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
    int toMove = 2;
    List<Integer> expectedStart = new ArrayList<Integer>(Arrays.asList(1, 3, 4));
    List<Integer> expectedEnd = new ArrayList<Integer>(Arrays.asList(2, 2, 2, 2, 2));
    List<Integer> output = Program.moveElementToEnd(array, toMove);
    List<Integer> outputStart = output.subList(0, 3);
    outputStart.sort(Comparator.naturalOrder());
    List<Integer> outputEnd = output.subList(3, output.size());
    Utils.assertTrue(outputStart.equals(expectedStart));
    Utils.assertTrue(outputEnd.equals(expectedEnd));
  }
}
