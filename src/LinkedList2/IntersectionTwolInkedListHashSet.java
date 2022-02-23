package LinkedList2;

public class IntersectionTwolInkedListHashSet {

    Node head;

    public static void main(String[] args) {

        IntersectionTwolInkedListHashSet linkedlist1  = new IntersectionTwolInkedListHashSet();

        linkedlist1.head = new Node(1);
        linkedlist1.head.next = new Node(2);
        linkedlist1.head.next.next = new Node(8);
        linkedlist1.head.next.next.next = new Node(7);
        linkedlist1.head.next.next.next.next = new Node(6);

        System.out.println("Linked List l1");
        LinkedListCommonMethods.printlist(linkedlist1.head);

        IntersectionTwolInkedListHashSet linkedlist2  = new IntersectionTwolInkedListHashSet();
        linkedlist2.head = new Node(2);
        linkedlist2.head.next = new Node(8);
        linkedlist2.head.next.next = new Node(1);
        linkedlist2.head.next.next.next = new Node(3);
        linkedlist2.head.next.next.next.next = new Node(8);
        linkedlist2.head.next.next.next.next.next = new Node(7);
        linkedlist2.head.next.next.next.next.next.next = new Node(6);

        System.out.println("Linked List l2");
        LinkedListCommonMethods.printlist(linkedlist2.head);


        IntersectionTwolInkedListHashSet anshead  = new IntersectionTwolInkedListHashSet();
        anshead.head = findingIntersection(linkedlist1.head,linkedlist2.head);

    }

    private static Node findingIntersection(Node head, Node head1) {


        return head;
    }

}
