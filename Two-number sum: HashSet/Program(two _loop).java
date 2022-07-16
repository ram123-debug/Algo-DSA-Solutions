import java.util.*;

class Program(two_loop) {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    int[] arr=new int [2];
    for(int i=0;i<array.length;i++){
       for(int j=i;j<array.length;j++){
         if((array[i] + array [j]) == targetSum && array[i]!=array[j]){ 
           arr[0]=array[i];
           arr[1]=array[j];
           return arr;
           }
        
         }
       }
      return new int[0];
      }
  
}
