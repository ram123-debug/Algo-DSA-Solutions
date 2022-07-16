import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  //int counter=1;
  public static int productSum(List<Object> array){
    return productSumHelper(array, 1);
  }
  public static int productSumHelper(List<Object> array, int multiplier) {
    // Write your code here.
    int sum=0;
    for(Object element: array){
      if( element instanceof ArrayList){
        @SuppressWarnings("unchecked")
        ArrayList<Object> list = (ArrayList<Object>) element;
        sum += productSumHelper(list, multiplier+1);
      } else sum += (int) element;     
    }
    return multiplier*sum;
    }
}
