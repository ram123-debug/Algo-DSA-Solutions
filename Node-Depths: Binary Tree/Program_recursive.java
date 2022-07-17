import java.util.*;

class Program {

  public static int nodeDepths(BinaryTree root) {
    int sumDepth=0;
    
    return calculateDepth(root, sumDepth);
  }
  public static int calculateDepth(BinaryTree tree, int sumDepth){
     
    if(tree == null) return 0 ;
   sumDepth=sumDepth+ calculateDepth(tree.left, sumDepth+1)+
    calculateDepth(tree.right, sumDepth+1);
    return sumDepth;
  }

  static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int value) {
      this.value = value;
      left = null;
      right = null;
    }
  }
}
