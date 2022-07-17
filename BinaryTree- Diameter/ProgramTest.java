// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    TestBinaryTree input = new TestBinaryTree(1);
    input.insert(new int[] {2, 3, 4, 5, 6, 7}, 0);
    var expected = 4;
    var actual = new Program().binaryTreeDiameter(input);
    Utils.assertTrue(expected == actual);
  }

  class TestBinaryTree extends Program.BinaryTree {
    public TestBinaryTree(int value) {
      super(value);
    }

    public void insert(int[] values, int i) {
      if (i >= values.length) {
        return;
      }
      ArrayDeque<Program.BinaryTree> queue = new ArrayDeque<Program.BinaryTree>();
      queue.addLast(this);
      while (queue.size() > 0) {
        Program.BinaryTree current = queue.pollFirst();
        if (current.left == null) {
          current.left = new Program.BinaryTree(values[i]);
          break;
        }
        queue.addLast(current.left);
        if (current.right == null) {
          current.right = new Program.BinaryTree(values[i]);
          break;
        }
        queue.addLast(current.right);
      }
      insert(values, i + 1);
    }
  }
}
