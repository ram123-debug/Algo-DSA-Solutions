import java.util.*;

class Program {
  public static void invertBinaryTree(BinaryTree tree) {
    // Write your code here.
    if(tree != null) swapTreeChildren(tree);
  }
  public static void swapTreeChildren(BinaryTree tree){
     if(tree == null) return;
       
     BinaryTree temp = tree.left;
     tree.left = tree.right;
     tree.right= temp;
     swapTreeChildren(tree.left);
     swapTreeChildren(tree.right);
    } 

  static class BinaryTree {
    public int value;
    public BinaryTree left;
    public BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
    }
  }
}
