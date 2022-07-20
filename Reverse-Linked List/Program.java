import java.util.*;

class Program {
  public static LinkedList reverseLinkedList(LinkedList head) {
    // Write your code here.
    LinkedList previousNode = null;
    LinkedList currentNode = head;

    while(currentNode != null)
      {
        LinkedList nextNode = currentNode.next;
        currentNode.next = previousNode;
        previousNode = currentNode;
        currentNode = nextNode;
      }
    return previousNode;
  }

  static class LinkedList {
    int value;
    LinkedList next = null;

    public LinkedList(int value) {
      this.value = value;
    }
  }
}
