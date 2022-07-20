// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  public Program.LinkedList addMany(Program.LinkedList ll, List<Integer> values) {
    Program.LinkedList current = ll;
    while (current.next != null) {
      current = current.next;
    }
    for (int value : values) {
      current.next = new Program.LinkedList(value);
      current = current.next;
    }
    return ll;
  }

  public List<Integer> getNodesInArray(Program.LinkedList ll) {
    List<Integer> nodes = new ArrayList<Integer>();
    Program.LinkedList current = ll;
    while (current != null) {
      nodes.add(current.value);
      current = current.next;
    }
    return nodes;
  }

  @Test
  public void TestCase1() {
    Program.LinkedList list1 = new Program.LinkedList(2);
    addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
    Program.LinkedList list2 = new Program.LinkedList(1);
    addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
    Program.LinkedList output = Program.mergeLinkedLists(list1, list2);
    List<Integer> expectedNodes =
        new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    Utils.assertTrue(getNodesInArray(output).equals(expectedNodes));
  }
}
