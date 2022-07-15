// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    Program.Node graph = new Program.Node("A");
    graph.addChild("B").addChild("C").addChild("D");
    graph.children.get(0).addChild("E").addChild("F");
    graph.children.get(2).addChild("G").addChild("H");
    graph.children.get(0).children.get(1).addChild("I").addChild("J");
    graph.children.get(2).children.get(0).addChild("K");
    String[] expected = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
    List<String> inputArray = new ArrayList<String>();
    Utils.assertTrue(compare(graph.breadthFirstSearch(inputArray), expected));
  }

  public static boolean compare(List<String> arr1, String[] arr2) {
    if (arr1.size() != arr2.length) {
      return false;
    }
    for (int i = 0; i < arr1.size(); i++) {
      if (!arr1.get(i).equals(arr2[i])) {
        return false;
      }
    }
    return true;
  }
}
