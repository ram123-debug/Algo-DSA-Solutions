import java.util.*;

class Program {
  // This is an input class. Do not edit.
  public static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
    // Write your code here.
    LinkedList newLinkedListHeadPointer= new LinkedList(0);
    LinkedList currentNode= newLinkedListHeadPointer;
    int carry=0;

    LinkedList nodeOne=linkedListOne;
    LinkedList nodeTwo=linkedListTwo;
    int valueOne, valueTwo, newValue, sumOfValues;

    while(nodeOne != null || nodeTwo != null || carry!=0){
       if(nodeOne != null) valueOne=nodeOne.value;
       else valueOne=0;
       if(nodeTwo != null) valueTwo=nodeTwo.value;
       else valueTwo=0;
       sumOfValues= valueOne+ valueTwo+ carry;

       newValue=sumOfValues %10;
       LinkedList newNode= new LinkedList(newValue);
      currentNode.next = newNode;
      currentNode = newNode;

      carry = sumOfValues/10;
      if(nodeOne != null) nodeOne= nodeOne.next;
      else nodeOne=null;
      if(nodeTwo != null) nodeTwo = nodeTwo.next;
      else nodeTwo=null;
    }
    
    return newLinkedListHeadPointer.next;
  }
}
