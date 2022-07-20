import java.util.*;

class Program {
  public static LinkedList findLoop(LinkedList head) {
    // Write your code here.
    if(head == null) return null;
    if(head.next == null) return head;
    List<LinkedList> visited = new ArrayList<LinkedList>();

    LinkedList currentNode=head;
    visited.add(head);
    while(!visited.contains(currentNode.next))
      { visited.add(currentNode.next);
        currentNode=currentNode.next;
       
      }
    
    return currentNode.next;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
