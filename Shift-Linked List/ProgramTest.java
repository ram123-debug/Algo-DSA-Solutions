// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  public List<Integer> linkedListToArray(Program.LinkedList head) {
    var array = new ArrayList<Integer>();
    var current = head;
    while (current != null) {
      array.add(current.value);
      current = current.next;
    }
    return array;
  }

  @Test
  public void TestCase1() {
    var head = new Program.LinkedList(0);
    head.next = new Program.LinkedList(1);
    head.next.next = new Program.LinkedList(2);
    head.next.next.next = new Program.LinkedList(3);
    head.next.next.next.next = new Program.LinkedList(4);
    head.next.next.next.next.next = new Program.LinkedList(5);
    var result = Program.shiftLinkedList(head, 2);
    var array = this.linkedListToArray(result);

    var expected = Arrays.asList(new Integer[] {4, 5, 0, 1, 2, 3});
    Utils.assertTrue(expected.equals(array));
  }
}
