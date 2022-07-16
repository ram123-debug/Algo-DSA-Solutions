import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    // Write your code here.
    Arrays.sort(coins);
    int currentChangeCreated=0;
    for(int coin:coins){
      if(currentChangeCreated+1 < coin) return currentChangeCreated+1;
      currentChangeCreated += coin;
    }
    return currentChangeCreated+1;
  }
}
