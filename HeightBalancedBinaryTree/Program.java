import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public boolean heightBalancedBinaryTree(BinaryTree tree) {
    // Write your code here.
    return height(tree) >= 0;
  }
  public int height(BinaryTree tree){
    if(tree == null) return 0;
    int l= height(tree.left);
    int r= height(tree.right);

    if(l < 0 || r <0 || Math.abs(l-r) > 1){
      return -1;
    }
    return 1 + Math.max(l, r);
  }
}
