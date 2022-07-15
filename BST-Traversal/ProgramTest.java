// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {

  @Test
  public void TestCase1() {
    var root = new Program.BST(10);
    root.left = new Program.BST(5);
    root.left.left = new Program.BST(2);
    root.left.left.left = new Program.BST(1);
    root.left.right = new Program.BST(5);
    root.right = new Program.BST(15);
    root.right.right = new Program.BST(22);

    List<Integer> inOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 10, 15, 22});
    List<Integer> preOrder = Arrays.asList(new Integer[] {10, 5, 2, 1, 5, 15, 22});
    List<Integer> postOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 22, 15, 10});

    Utils.assertTrue(Program.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder));
    Utils.assertTrue(Program.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder));
    Utils.assertTrue(Program.postOrderTraverse(root, new ArrayList<Integer>()).equals(postOrder));
  }
}
