import java.util.*;

class Program {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your cod.
    Set<Integer> visitedSet = new HashSet<Integer>();
    for(int num:array){
      if(visitedSet.contains(targetSum-num)) {
        return new int[]{targetSum-num, num};
      } else {
        visitedSet.add(num);
      }
    }
    return new int[0];
  }
}
