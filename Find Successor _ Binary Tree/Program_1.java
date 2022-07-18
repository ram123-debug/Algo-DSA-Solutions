import java.util.*;

class Program {
  // This is an input class. Do not edit.
  static class BinaryTree {
    public int value;
    public BinaryTree left = null;
    public BinaryTree right = null;
    public BinaryTree parent = null;

    public BinaryTree(int value) {
      this.value = value;
    }
  }

  public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
    
    // Write your code here.
    List<BinaryTree> array = new ArrayList<BinaryTree>();
    List<BinaryTree> newArray = inOrderTraversal(tree, array);
    int iDx=0;
    if(newArray.contains(node)) iDx = newArray.indexOf(node);
    if(newArray.size()-1== iDx) return null;
    if(!newArray.contains(node)) return null;
    return newArray.get(iDx+1) ;
  }
  public static List<BinaryTree> inOrderTraversal(BinaryTree tree, List<BinaryTree> array){

    if(tree == null) return null;
    inOrderTraversal(tree.left, array);
    array.add(tree);
    inOrderTraversal(tree.right, array);
    return array;
  }
}
