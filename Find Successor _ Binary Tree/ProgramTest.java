// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    Program.BinaryTree root = new Program.BinaryTree(1);
    root.left = new Program.BinaryTree(2);
    root.left.parent = root;
    root.right = new Program.BinaryTree(3);
    root.right.parent = root;
    root.left.left = new Program.BinaryTree(4);
    root.left.left.parent = root.left;
    root.left.right = new Program.BinaryTree(5);
    root.left.right.parent = root.left;
    root.left.left.left = new Program.BinaryTree(6);
    root.left.left.left.parent = root.left.left;
    Program.BinaryTree node = root.left.right;
    Program.BinaryTree expected = root;
    Program.BinaryTree output = new Program().findSuccessor(root, node);
    assert (expected == output);
  }
}
