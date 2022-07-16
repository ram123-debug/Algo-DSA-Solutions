// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
    ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
    ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
    ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
    competitions.add(competition1);
    competitions.add(competition2);
    competitions.add(competition3);
    ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
    String expected = "Python";
    var actual = new Program().tournamentWinner(competitions, results);
    Utils.assertTrue(expected == actual);
  }
}
