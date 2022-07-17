import java.util.*;

class Program {
  public static void invertBinaryTree(BinaryTree tree) {
    // Write your code here.
    ArrayDeque<BinaryTree> que= new ArrayDeque<BinaryTree> ();
    que.addLast(tree);
    while(que.size()>0){
      BinaryTree current = que.pollFirst();
      if (current == null) continue;
      swapLeftAndRight(current);
      if(current.left!=null) que.addLast(current.left);
     if(current.right != null) que.addLast(current.right);
    }
    }
    public static void swapLeftAndRight(BinaryTree node){
      BinaryTree temp=node.left;
    node.left=node.right;
    node.right=temp;
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
