
import java.util.*;

public class LinkedList_03 {
  Node head;
  private int size;

  LinkedList_03() { 
    this.size = 0;
  }

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  public void deleteFirst() {
    if (head == null) {
      System.out.println("the head is empty");
      return;
    }
    size--;
    head = head.next;
  }

  public void deleteLast() {
    if (head == null) {
      System.out.println("the head is empty");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }

    Node secondLast = head;
    Node lastNode = head.next;

    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }

    secondLast.next = null;

  }

  public int getSize() {
    return size;
  }

  void display() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.println(currNode.data + " ");
      currNode = currNode.next;
    }

  }

  public static void main(String[] args) {
    LinkedList_03 list = new LinkedList_03();
    list.addFirst("rr");
    list.addFirst("fdd");
    list.display();
    System.out.println("-------------------------------");
    list.addLast("tyrui");
    list.addLast("hjk");
    list.display();
    System.out.println("-------------------------------");

    list.deleteFirst();
    list.display();

    System.out.println("-------------------------------");

    list.deleteLast();
    list.display();

    System.out.println("-------------------------------");

    System.out.println(list.getSize());
  }
}
