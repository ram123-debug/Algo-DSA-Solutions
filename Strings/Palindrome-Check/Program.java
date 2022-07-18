import java.util.*;

class Program {
  public static boolean isPalindrome(String str) {
    // Write your code here.
    int length = str.length();
    int leftIdx=0;
    int rightIdx=length-1;

    while(leftIdx< rightIdx){
      if(str.charAt(leftIdx)!= str.charAt(rightIdx)) return false;
      leftIdx++;
      rightIdx--;
    }
    return true;
  }
}
