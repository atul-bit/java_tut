import java.util.*;

class DeleteLinkedList {
  Node head;
  private int size;

  DeleteLinkedList() {
    this.size = 0;
  }

  class Node {
    String data;
    Node next;

    // default contructor
    Node(String data) {
      this.data = data;
      this.next = null;
      size++;
    }
  }

  // add at first
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;

  }

  // add last function
  public void addLast(String data) {
    Node lastNode = new Node(data);
    if (head == null) {
      head = lastNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = lastNode;

  }

  // print a linkedList
  public void print() {
    Node currNode = head;
    if (head == null) {
      System.out.println("No elements in the list");
      return;
    }
    while (currNode != null) {
      System.out.println(currNode.data);
      currNode = currNode.next;
    }

  }

  // delete first
  public void deleteFirst() {
    if (head == null) {
      System.out.println("list is empty");
      return;
    }
    size--;
    head = head.next;
  }

  // delete last
  public void deleteLast() {
    if (head == null) {
      System.out.println("Empty List, nothing to delete");
      return;
    }
    size--;
    if (head.next == null) {
      head = null;
      return;
    }
    Node currNode = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      currNode = currNode.next;
      lastNode = lastNode.next;
    }
    currNode.next = null;
  }

  // size

  public int getSize() {
    return size;
  }

  public static void DeleteLinkedList(String[] args) {
    DeleteLinkedList LL = new DeleteLinkedList();
    LL.addFirst("hello");
    LL.addFirst("World");
    LL.print();
    System.out.println();

    LL.addLast("one");
    LL.print();
    System.out.println();

    LL.addFirst("first");
    LL.print();
    System.out.println();

    LL.deleteFirst();
    LL.print();
    System.out.println();

    LL.deleteLast();
    LL.print();

    System.out.println(LL.getSize());

  }
}