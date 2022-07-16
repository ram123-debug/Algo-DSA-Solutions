import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    int leftIdx=0;
    int rightIdx=array.length-1;
    while(leftIdx <= rightIdx) {
      int midIdx=(leftIdx+rightIdx)/2;
      if(array[midIdx] > target) rightIdx=midIdx-1;
      else if(array[midIdx]< target) leftIdx=midIdx+1;
      else return midIdx;
    }
    
    return -1;
  }
}
