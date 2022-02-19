package LinkedLIst;


// class Node {
//     int data;
//     Node next;
//
//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }
 class MiddleOfLinkedList {

     Node head; //Imp

        public static void main(String[] args) {

            MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
            middleOfLinkedList.head = new Node(1);
            middleOfLinkedList.head.next = new Node(2);
            middleOfLinkedList.head.next.next = new Node(3);
            middleOfLinkedList.head.next.next.next = new Node(4);
            middleOfLinkedList.head.next.next.next.next = new Node(5);
            middleOfLinkedList.head.next.next.next.next.next = new Node(6);

            System.out.println("Print the Given Linked List :");
            middleOfLinkedList.printList(middleOfLinkedList.head);

            //Optimized Solution -Tortoise technique.

            int middleNodeData = middleOfLinkedList.middleElement(middleOfLinkedList.head);
            System.out.println();
            System.out.println("Middle node data is :"+middleNodeData);
    }

    private int middleElement(Node head) {
        Node slow= head;
        Node fast=head;
        //Odd and Even Case
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.data;

    }

    private void printList(Node head) {
        Node dummy = head;
//        int count=0;
        while (dummy != null) {  //Imp
            System.out.print(dummy.data + " ");
            dummy = dummy.next;
//            count++;
        }
//        System.out.println();
//        System.out.println("Number of Node in Linked List is :"+count);
//
//        int n = (count/2)+1;
//        System.out.println("Middle node index :"+n);
//
//        Node middleNode = head;
//        for(int i=2;i<=n;i++)
//        {
//            middleNode=middleNode.next; // Starts from 2
//        }
//       System.out.println("Middle node data is :"+middleNode.data);


    }
}
