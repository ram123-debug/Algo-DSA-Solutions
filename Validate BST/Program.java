import java.util.*;

class Program {
  public static boolean validateBst(BST tree) {
    // Write your code here.
    return valid(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }
  public static boolean valid(BST tree, int min, int max){
    if(tree==null) return true;
    if(tree.value < min || tree.value >= max) return false;
    boolean leftIsValid=valid(tree.left, min, tree.value);
    boolean rightIsValid=valid(tree.right, tree.value,max);
    return leftIsValid && rightIsValid;
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
