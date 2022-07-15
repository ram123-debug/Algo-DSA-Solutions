import java.util.*;

class Program {
  public static boolean hasSingleCycle(int[] array) {
    // Write your code here.
    int numElementVisited=0;
    int currentIdx=0;
    while(numElementVisited < array.length){
       if(numElementVisited > 0 && currentIdx==0) return false;
       numElementVisited+=1;
       currentIdx=getNextIdx(currentIdx, array);
       }
    return currentIdx==0;
  }
  public static int getNextIdx(int currentIdx,int[] array){
    int jump=array[currentIdx];
    int nextIdx=(currentIdx+jump)%array.length;
    if(nextIdx>=0) return nextIdx;
    else return nextIdx+array.length;
  }
}
