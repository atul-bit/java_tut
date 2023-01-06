class ReverseLinkedList {
  Node head;
  private int size;

  ReverseLinkedList(){
    this.size = 0;
  }
  class Node {
    String data;
    Node next;

    //default contructor
    Node(String data){
      this.data = data;
      this.next = null;
      size++;
    }
  }

  //add at first
  public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
    
  }

  //add last function
  public void addLast(String data){
    Node lastNode = new Node(data);
    if(head == null){
      head = lastNode;
      return;
    }
    Node currNode = head;
    while(currNode.next != null){
      currNode= currNode.next;
    }
    currNode.next = lastNode;

  }

  //print a linkedList
  public void print(){
    Node currNode = head;
    if(head == null){
      System.out.println("No elements in the list");
      return;
    }
    while(currNode != null){
      System.out.println(currNode.data);
      currNode = currNode.next;
    }
    
  }

  //reverseLinkedList
  public void rerverseLinkedList(){
    if(head == null || head.next == null){
      return ;
    }

    Node prevNode = head;
    Node currNode = head.next;

    while(currNode != null){
      Node nextNode = currNode.next;
      currNode.next = prevNode;

      //update
      prevNode = currNode;
      currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
  }

  //get the size of the linkedList
  public int getSize(){
    return size;
  }
  public static void ReverseLinkedList(String[] args){
    ReverseLinkedList LL = new ReverseLinkedList();
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
    
    LL.print();
    System.out.println();

    LL.print();

    System.out.println(LL.getSize());

    LL.print();
    System.out.println();

    LL.rerverseLinkedList();
    LL.print();
    
     
  }
}