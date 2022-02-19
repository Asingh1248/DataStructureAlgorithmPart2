package LinkedLIst;


 class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class MergeSortedLinkedList {
   Node head; //Imp

    public static void main(String[] args) {
        MergeSortedLinkedList mergeSortedLinkedList1 = new MergeSortedLinkedList();
        mergeSortedLinkedList1.addToTheLast(new Node(3));
        mergeSortedLinkedList1.addToTheLast(new Node(4));
        mergeSortedLinkedList1.addToTheLast(new Node(8));
        mergeSortedLinkedList1.addToTheLast(new Node(10));



        System.out.println("Sorted Linked List 1 :");
        mergeSortedLinkedList1.printList(mergeSortedLinkedList1.head);

        MergeSortedLinkedList mergeSortedLinkedList2 = new MergeSortedLinkedList();
        mergeSortedLinkedList2.addToTheLast(new Node(5));
        mergeSortedLinkedList2.addToTheLast(new Node(7));
        mergeSortedLinkedList2.addToTheLast(new Node(9));

        System.out.println("Sorted Linked List 2 :");
        mergeSortedLinkedList2.printList(mergeSortedLinkedList2.head);

        System.out.println("  Sorted Linked List 1 and Linked List 2 from Extra Space method : ");


//        mergeSortedLinkedList1.head = new Gfg().
//                mergesort(mergeSortedLinkedList1.head ,mergeSortedLinkedList2.head  );
//
//        System.out.println("Sorted Linked List 1 and Linked List 2 using extra Space :");
//        mergeSortedLinkedList1.printList(mergeSortedLinkedList1.head);

        System.out.println(" \n Sorted Linked List 1 and Linked List 2 from In-place method : ");

        mergeSortedLinkedList2.head = new GfgInplace().
                mergeTwoLists(mergeSortedLinkedList1.head ,mergeSortedLinkedList2.head);

        mergeSortedLinkedList2.printList(mergeSortedLinkedList2.head);

    }



    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }


    public void printList(Node head) {
        Node dummy = head;
        while (dummy != null) {  //Imp
            System.out.print(dummy.data + " ");
            dummy = dummy.next;
        }
        System.out.println();
    }

}

class Gfg
{
 Node mergesort(Node head1, Node head2) {

        // Dummy Node and Tail Node to last node

        Node dummyNode = new Node(0);
        Node mergeTail = dummyNode;

        while(true){
        //Case 1 : Where there is no First Linked List and second Linked List
        if(head1==null){
        mergeTail.next=head2;
        break;
        }

        if(head2==null){
        mergeTail.next=head1;
        break;
        }

        //Case 2 : Second linked list data
        if(head1.data >= head2.data){
        //mergetail =head
        mergeTail.next = head2;
        head2 =head2.next;
        }
        else{
        mergeTail.next =head1;
        head1=head1.next;
        }

        //Case 3: Going to next node :-> incrementing step

        mergeTail = mergeTail.next;
        }
//        MergeSortedLinkedList linkedList = new MergeSortedLinkedList();
//        linkedList.printList(dummyNode.next);
        return dummyNode.next;
        }



}