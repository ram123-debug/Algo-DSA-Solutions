import java.util.*;

class Program {
  public static int findClosestValueInBst(BST tree, int target) {
    // Write your code here.
    // BST currentNode=tree;
    // int absDiff;
    // while(currentNode.left!=null){
    //   absDiff=Math.abs(target-currentNode.value);
    // }
    if(tree == null) return -1;
    
    int closest= tree.value;
    while(tree!=null){
      if(Math.abs(target-tree.value) < Math.abs(target-closest)){
        closest= tree.value;
      }
      if(target > tree.value){
        tree=tree.right;
      } else if (target< tree.value){
        tree=tree.left;
      } else break;
    }
    return closest;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }
  }
}
