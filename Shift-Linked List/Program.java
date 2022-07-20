import java.util.*;

class Program {
  public static LinkedList shiftLinkedList(LinkedList head, int k) {
    LinkedList currentNode= head;
    int count=0;
    while(currentNode.next != null)
    {
        currentNode=currentNode.next;
        count++;
    }
    
    currentNode.next = head;
    count+=1;
    
    int step=0;
    int loop = count;
    if(k>0) k=k%count;

    while((step != (count-k-1)%count) && loop>=0 ){
      head=head.next;
      step++;
      loop--;}
    LinkedList prevNode = head;
    LinkedList nextNode = head.next;
     prevNode.next=null;
    
    return nextNode;
  }

  static class LinkedList {
    public int value;
    public LinkedList next;

    public LinkedList(int value) {
      this.value = value;
      next = null;
    }
  }
}
