package LinkedList2;

public class AdditionOfTwoNos {
    Node head;

    public static void main(String[] args) {
        AdditionOfTwoNos l1 = new AdditionOfTwoNos();
        l1.head = new Node(2);
        l1.head.next = new Node(4);
        l1.head.next.next = new Node(3);
//        LinkedListCommonMethods linkedListCommonMethods = new LinkedListCommonMethods();
//
//        linkedListCommonMethods.printlist(additionOfTwoNos.head);

        LinkedListCommonMethods.printlist(l1.head);  // declare method as static

        AdditionOfTwoNos l2 = new AdditionOfTwoNos();
        l2.head = new Node(5);
        l2.head.next = new Node(6);
        l2.head.next.next = new Node(7);
        l2.head.next.next.next = new Node(9);


        LinkedListCommonMethods.printlist(l2.head);

        AdditionOfTwoNos anshead = new AdditionOfTwoNos();
        anshead.head = addingTwoLinkedListData(l1.head,l2.head);

       LinkedListCommonMethods.printlist(anshead.head);


    }

    private static Node addingTwoLinkedListData(Node l1, Node l2) {

        Node dummyNode = new Node(0);
        //Linking with temp Node and next
        Node temp = dummyNode;
//        System.out.println(temp.data);
        int carry=0;
        while(l2!=null || l1!=null ||carry==1 ){

            //First is sum
            int sum=0;
            if(l1!=null){  //First list node
                sum+=l1.data;
                l1=l1.next;
            }

            if(l2!=null){  //Second List node
                sum+=l2.data;
                l2=l2.next;
            }
            sum+=carry;  //First carry add hoga and then netx sum
            carry=sum/10;

            Node node = new Node(sum%10);
            temp.next=node; //Answer stored in
//            System.out.println(temp.data + " ");
            temp = temp.next;  //Next temp
        }

      return  dummyNode.next;  //dummyNode is with Linkedlist temp first and
        // if we point nect of temp and Automatically get the answer of tempNode

    }

}
