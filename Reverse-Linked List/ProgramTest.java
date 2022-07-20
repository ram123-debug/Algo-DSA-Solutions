// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    Program.LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
    List<Integer> result = toArrayList(Program.reverseLinkedList(test));
    int[] expected = new int[] {5, 4, 3, 2, 1, 0};
    Utils.assertTrue(arraysEqual(result, expected));
  }

  public Program.LinkedList newLinkedList(int[] values) {
    Program.LinkedList ll = new Program.LinkedList(values[0]);
    Program.LinkedList current = ll;
    for (int i = 1; i < values.length; i++) {
      current.next = new Program.LinkedList(values[i]);
      current = current.next;
    }
    return ll;
  }

  public List<Integer> toArrayList(Program.LinkedList ll) {
    List<Integer> arr = new ArrayList<Integer>();
    Program.LinkedList current = ll;
    while (current != null) {
      arr.add(current.value);
      current = current.next;
    }
    return arr;
  }

  public boolean arraysEqual(List<Integer> arr1, int[] arr2) {
    if (arr1.size() != arr2.length) return false;
    for (int i = 0; i < arr1.size(); i++) {
      if (arr1.get(i) != arr2[i]) return false;
    }
    return true;
  }
}
