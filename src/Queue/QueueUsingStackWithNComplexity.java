package Queue;

import java.util.Stack;

public class QueueUsingStackWithNComplexity {

    static Stack<Integer> S1 = new Stack<Integer>();
    static Stack<Integer>  S2 = new Stack<Integer>();
    static int size=0;

    public static void main(String[] args) {
        QueueUsingStackWithNComplexity queueUsingStackWithNComplexity = new QueueUsingStackWithNComplexity();
        queueUsingStackWithNComplexity.push(4);
        queueUsingStackWithNComplexity.push(3);
        queueUsingStackWithNComplexity.push(2);

        System.out.println(queueUsingStackWithNComplexity.top());
        queueUsingStackWithNComplexity.pop();
        System.out.println(queueUsingStackWithNComplexity.top());

    }

    private void push(int x) {
        //Firstly Transfer from S1 to S2

        while(!S1.isEmpty()){
            S2.push(S1.peek());
            S1.pop();
        }

        S1.push(x);

        while(!S2.isEmpty()){
            S1.push(S2.peek());
            S2.pop();
        }
    }

    private int top() {
        return S1.peek();

    }

    private void pop() {
        S1.pop();
    }
}
