import java.util.*;

class Program {
  public int[] arrayOfProducts(int[] array) {
    // Write your code here.
    int [] outputArray = new int[array.length];
    for(int i=0;i<array.length;i++)
      {  int multiple=1;
        
        for(int j=0;j<array.length;j++)
          { 
           
            if(i==j) continue;
            else
            multiple *= array[j];
            
          }
        outputArray[i] = multiple;
      }
    return outputArray;
  }
}
