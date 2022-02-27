package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {


    static Queue<Integer> Q1 = new LinkedList<>();
    static  int size =0;
    public static void main(String[] args) {

        StackUsingOneQueue stackUsingOneQueue = new StackUsingOneQueue();
        stackUsingOneQueue.push(3);
        stackUsingOneQueue.push(4);
        stackUsingOneQueue.push(2);
        System.out.println(stackUsingOneQueue.top());
        System.out.println("Size of Stack Before Pop :"+size);
        stackUsingOneQueue.pop();
        System.out.println(stackUsingOneQueue.top());
        System.out.println("Size of Stack After Pop :"+size);


    }

    private void pop() {
        if(Q1.isEmpty())
            return;
        Q1.poll();
        --size;
    }

    private int top() {
        if(Q1.isEmpty())
            return -1;
        return Q1.peek();

    }

    private void push(int x) {
        Q1.add(x);
        for(int i=0;i<Q1.size()-1;i++){   //size -1 is V.Imp Dusre wale se upper pehle wala jayenga
            //Niche wala upper jayenga
            Q1.add(Q1.peek());
            Q1.poll();
        }
        size++;
    }


}
