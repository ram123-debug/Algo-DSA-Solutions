import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    List<Integer> sumList=new ArrayList<Integer>();
    calculateBranchSums(root, 0, sumList);
    return sumList;
  }
  public static void calculateBranchSums(BinaryTree node, int runningSum,List<Integer>sums){
     if (node == null) return;
     int newRunningSum = runningSum + node.value;
     if(node.right == null && node.left == null){
       sums.add(newRunningSum);
       return ;
     }
     calculateBranchSums(node.left, newRunningSum, sums);
      calculateBranchSums(node.right, newRunningSum, sums);
    }
}
