import java.util.*;

class Program {

  public int firstDuplicateValue(int[] array) {
    // Write your code here.
   int pointer1=0;
   int pointer2=1;
   int minimumIdx = array.length;
   while(pointer1 < array.length)
     { 
        pointer2=pointer1+1;
        while(pointer2 < array.length)
        {
          if(array[pointer1] == array[pointer2]) 
          {
            if(pointer2 < minimumIdx) minimumIdx = pointer2;
          }
          pointer2++;
        } 
       pointer1++;
       
     }
    if(minimumIdx == array.length) return -1;
    return array[minimumIdx];
  }
}
