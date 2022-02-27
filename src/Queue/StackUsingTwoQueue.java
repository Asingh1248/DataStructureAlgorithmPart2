package Queue;

import java.util.Collections;

import java.util.LinkedList;
import java.util.Queue;


public class StackUsingTwoQueue {

    static Queue<Integer> Q1 = new LinkedList<>();
    static Queue<Integer> Q2 = new LinkedList<>();
    static int size =0;  //Use it to get the size;

    public static void main(String[] args) {

        StackUsingTwoQueue stackUsingTwoQueue = new StackUsingTwoQueue();
        stackUsingTwoQueue.push(3);
        stackUsingTwoQueue.push(4);
        stackUsingTwoQueue.push(2);
        System.out.println(stackUsingTwoQueue.top());
        stackUsingTwoQueue.pop();
        System.out.println(stackUsingTwoQueue.top());

    }

    private void pop() {
        if (Q1.isEmpty())
            return ;
        Q1.poll();

    }


    private void push(int x) {
        Q2.add(x);
        // Sending all elements of Q1 to Q2 one by one
        //Intuition tking one set and place of anoether : tower Of hanoi
        while(!Q1.isEmpty()){
            Q2.add(Q1.peek());
            Q1.poll();
        }

        swap(Q1,Q2);

    }

    private Integer top() {
        if (Q1.isEmpty())
            return -1;
        return Q1.peek();
    }
    private void swap(Queue<Integer> q1, Queue<Integer> q2) {
        Queue<Integer> temp = new LinkedList<>();
        temp =Q1;
        Q1=Q2;
        Q2=temp;
    }

}
