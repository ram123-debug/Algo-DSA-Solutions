import java.util.*;

class Program {
  public static BST minHeightBst(List<Integer> array) {
    // Write your code here.
    
    return constructMinHeightBst(array, null, 0, array.size()-1);
    
  }
  public static BST constructMinHeightBst(List<Integer> array, BST bst, int startIdx, int endIdx) {
    if(endIdx < startIdx) return null;
    int midIdx = (startIdx + endIdx)/2;
    BST newBstNode = new BST(array.get(midIdx));
    if(bst==null){
      bst = newBstNode;
    } else {
      if(array.get(midIdx)< bst.value){
        bst.left = newBstNode;
        bst= bst.left;
      } else {
        bst.right = newBstNode;
        bst = bst.right;
        
      }
    }
    constructMinHeightBst(array, bst, startIdx, midIdx-1);
    constructMinHeightBst(array, bst, midIdx+1, endIdx);
    return bst;
  }

  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
      left = null;
      right = null;
    }

    public void insert(int value) {
      if (value < this.value) {
        if (left == null) {
          left = new BST(value);
        } else {
          left.insert(value);
        }
      } else {
        if (right == null) {
          right = new BST(value);
        } else {
          right.insert(value);
        }
      }
    }
  }
}
