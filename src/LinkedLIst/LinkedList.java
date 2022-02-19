package LinkedLIst;


class LinkedList
{
  Node head; //Imp

    static class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
  }

  public void append(int new_data)
  {
      Node new_node = new Node(new_data);
      /* Case 1 : If the Linked List is empty, then make the  new node as head */
      if(head ==null){
          head = new Node(new_data);
          return;
      }

        /* Case 2 : This new node is going to be the last node, so make next of it as null */
      new_node.next=null;

      /* Case 3: Else traverse till the last node */
      Node last = head;
      while(last.next!=null)
          last =last.next;

      last.next=new_node;
      return;

  }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }



    //testing the method

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(1);
        linkedList.append(4);

        System.out.println("Created Linked List :");
        linkedList.printList();

    }


}


