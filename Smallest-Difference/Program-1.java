import java.util.*;

class Program {
  public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
    // Write your code here.
    int smallestDifference = Integer.MAX_VALUE;
    int [] array = new int[2];

    for(int i =0 ;i< arrayOne.length ;i++)
    {
      for(int j=0;j< arrayTwo.length ;j++)
        {
          if(absoluteDifference(arrayOne[i], arrayTwo[j]) < smallestDifference){
            
          smallestDifference = absoluteDifference(arrayOne[i], arrayTwo[j]);
          array[0]=arrayOne[i];array[1]=arrayTwo[j];
            }
          else continue;
        }
    }
    return array;
  }
  public static int absoluteDifference(int arrayOne, int arrayTwo)
  {
    if((arrayOne >= 0 && arrayTwo >=0) || (arrayOne <=0 && arrayTwo <=0) ) return Math.abs(arrayOne-arrayTwo);
    else if (arrayOne >= 0 ) return arrayOne-arrayTwo;
    else return arrayTwo-arrayOne;
    
  }
}
