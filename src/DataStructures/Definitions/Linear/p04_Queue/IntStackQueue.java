package DataStructures.Definitions.Linear.p04_Queue;

import java.util.NoSuchElementException;
import java.util.Stack;

public class IntStackQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public IntStackQueue(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item){
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        System.out.println(this);
        stack1.push(item);
    }

    public int dequeue(){
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        System.out.println(this);
        if (stack2.isEmpty())
            throw new NoSuchElementException();
        return stack2.pop();
    }

    @Override
    public String toString() {
        return "IntStackQueue{" +
                "stack1=" + stack1 +
                ", stack2=" + stack2 +
                '}';
    }
}
