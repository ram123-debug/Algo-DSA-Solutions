// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import java.util.*;

class ProgramTest {
  @Test
  public void TestCase1() {
    List<Integer> array = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
    var tree = Program.minHeightBst(array);

    Utils.assertTrue(validateBst(tree));
    Utils.assertEquals(4, getTreeHeight(tree));

    var inOrder = inOrderTraverse(tree, new ArrayList<Integer>());
    List<Integer> expected = Arrays.asList(1, 2, 5, 7, 10, 13, 14, 15, 22);
    Utils.assertTrue(expected.equals(inOrder));
  }

  static boolean validateBst(Program.BST tree) {
    return validateBst(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  static boolean validateBst(Program.BST tree, int minValue, int maxValue) {
    if (tree.value < minValue || tree.value >= maxValue) {
      return false;
    }
    if (tree.left != null && !validateBst(tree.left, minValue, tree.value)) {
      return false;
    }
    if (tree.right != null && !validateBst(tree.right, tree.value, maxValue)) {
      return false;
    }
    return true;
  }

  static List<Integer> inOrderTraverse(Program.BST tree, List<Integer> array) {
    if (tree.left != null) {
      inOrderTraverse(tree.left, array);
    }
    array.add(tree.value);
    if (tree.right != null) {
      inOrderTraverse(tree.right, array);
    }
    return array;
  }

  static int getTreeHeight(Program.BST tree) {
    return getTreeHeight(tree, 0);
  }

  static int getTreeHeight(Program.BST tree, int height) {
    if (tree == null) return height;
    int leftTreeHeight = getTreeHeight(tree.left, height + 1);
    int rightTreeHeight = getTreeHeight(tree.right, height + 1);
    return Math.max(leftTreeHeight, rightTreeHeight);
  }
}
