package LinkedLIst;

public class GfgInplace {

    public Node mergeTwoLists(Node l1,Node l2){
        if(l1==null) return  l2;
        if(l2==null) return  l1;

        //Step 1: Swapping to know from which list to start (one and second)
        if(l1.data > l2.data){
             Node temp = l1;
             l1=l2;
             l2=temp;
         }


        Node result = l1; //  I just want head which is l1 head and next of l1 and its element automatically handle oin belo wcode
        while(l1!=null && l2!=null){
            Node tmp =null;
            while(l1!=null &&  l1.data<=l2.data){
                System.out.println("l1 " +l1.data);
                tmp=l1;  // stores previous value;
                l1=l1.next;  // By default hote rahega if l2 is less l1 hi iterate hote raheg
//                System.out.println("Temp data :"+tmp.data);

            }

            tmp.next=l2;  // But if l2 is less then l1.next se link l2 hona chaiye

            //Last Swap to take l1 to l2

            Node temp = l1;
            l1=l2;
            l2=temp;

            System.out.println(" Outside loop l1 " +l1.data);


        }

      return result;

    }

}
