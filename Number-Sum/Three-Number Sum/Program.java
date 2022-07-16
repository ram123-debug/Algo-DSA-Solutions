import java.util.*;

class Program {
  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
    // Write your code here.
    List<Integer[]> list = new ArrayList<Integer[]> ();
    int n = array.length;
    Arrays.sort(array);
    int i=0, j=n-1;
    for(int k=0; k<n;k++)
    { i=k;j=n-1;
      int x = array[k];
      while(i+1< j){
        if(array[i+1]+ array[j] > targetSum-x) j--;
        else if( array[i+1] + array[j] < targetSum - x) i++;
        else {
          Integer[] arr = new Integer[]{x, array[i+1], array[j]};
          list.add(arr);
          i++;
          j--;
        }
      }
    }    return list;
  }
}
