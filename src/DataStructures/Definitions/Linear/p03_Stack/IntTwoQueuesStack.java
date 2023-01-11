package DataStructures.Definitions.Linear.p03_Stack;

import java.util.ArrayDeque;
import java.util.EmptyStackException;
import java.util.Queue;

public class IntTwoQueuesStack {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public IntTwoQueuesStack(){
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int item){
        queue1.add(item);
    }

    public int pop(){
        int size=queue1.size();
        if (queue1.isEmpty())
            throw new EmptyStackException();
        // Copy to queue2 all elements except one
        for (int i = 0; i < size-1; i++) {
            queue2.add(queue1.remove());
        }
        // Extract last element.
        int result=queue1.remove();
        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        temp = null;
        return result;
    }

    public int peek(){
        int size=queue1.size();
        if (queue1.isEmpty())
            throw new EmptyStackException();
        // Shift to last element.
        for (int i = 0; i < size-1; i++) {
            queue1.add(queue1.remove());
        }
        // Extract last element.
        int result=queue1.remove();
        queue1.add(result);
        return result;
    }

    public boolean isEmpty(){
        return queue1.isEmpty() && queue2.isEmpty();
    }

    @Override
    public String toString() {
        return "IntStackTwoQueues{" +
                "queue1=" + queue1 +
                ", queue2=" + queue2 +
                '}';
    }
}
