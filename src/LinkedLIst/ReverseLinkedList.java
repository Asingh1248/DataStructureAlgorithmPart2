package LinkedLIst;


public class ReverseLinkedList {

    static Node head; //Imp

//    static  class Node{
//        int data;
//        Node next;
//
//        Node(int d){
//          data =d;
//          next =null;
//        }
//
//    }

    public static void main(String[] args) {

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        reverseLinkedList.head = new Node(1);
        reverseLinkedList.head.next = new Node(2);
        reverseLinkedList.head.next.next = new Node(3);
        reverseLinkedList.head.next.next.next = new Node(4);
        reverseLinkedList.head.next.next.next.next = new Node(5);

        System.out.println("Print the Given Linked List :");
        reverseLinkedList.printList(head);

        head =reverseLinkedList.reverse(head);

        System.out.println();
        System.out.println("Printing the Reverse Linked List :");
        reverseLinkedList.printList(head);
    }

    private Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while(current!=null){
            //Step 1 :Where does next goes (Swap code )
            next=current.next;

            //Step 1: To Have current head pointed to Null //ACtually Swapping
            current.next = prev;

            prev= current;
            current=next;
        }
       node = prev;
        return  node;
    }

    public void printList(Node node) {
        Node dummy=head;
        while(dummy!=null){  //Imp
            System.out.print(dummy.data + " ");
            dummy=dummy.next;
        }

    }

}
