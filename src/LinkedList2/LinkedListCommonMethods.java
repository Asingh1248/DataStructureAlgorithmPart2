package LinkedList2;

public class LinkedListCommonMethods {

    public static void printlist(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println();
    }
     //We can't create head itself
//    public Node addNodeAtLast(Node node){
//
//        if(head==null){
//            head=node;  // head will from class
//        }
//         else{
//             Node dummy = head;
//             while(dummy.next!=null){
//                dummy=dummy.next;
//             }
//             ?=node;
//        }
//    }


}
