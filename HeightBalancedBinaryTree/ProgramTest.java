// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    Program.BinaryTree root = new Program.BinaryTree(1);
    root = new Program.BinaryTree(1);
    root.left = new Program.BinaryTree(2);
    root.right = new Program.BinaryTree(3);
    root.left.left = new Program.BinaryTree(4);
    root.left.right = new Program.BinaryTree(5);
    root.right.right = new Program.BinaryTree(6);
    root.left.right.left = new Program.BinaryTree(7);
    root.left.right.right = new Program.BinaryTree(8);
    boolean expected = true;
    var actual = new Program().heightBalancedBinaryTree(root);
    Utils.assertTrue(expected == actual);
  }
}
