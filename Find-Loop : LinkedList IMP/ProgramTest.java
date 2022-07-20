// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

class ProgramTest {
  @Test
  public void TestCase1() {
    TestLinkedList test = new TestLinkedList(0);
    test.addMany(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
    test.getNthNode(10).next = test.getNthNode(5);
    Utils.assertTrue(Program.findLoop(test) == test.getNthNode(5));
  }

  class TestLinkedList extends Program.LinkedList {
    public TestLinkedList(int value) {
      super(value);
    }

    public void addMany(int[] values) {
      Program.LinkedList current = this;
      while (current.next != null) {
        current = current.next;
      }
      for (int value : values) {
        current.next = new Program.LinkedList(value);
        current = current.next;
      }
    }

    public Program.LinkedList getNthNode(int n) {
      int counter = 1;
      Program.LinkedList current = this;
      while (counter < n) {
        current = current.next;
        counter++;
      }
      return current;
    }
  }
}
