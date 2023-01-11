package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p04_Queue.IntArrayQueue;
import DataStructures.Definitions.Linear.p04_Queue.IntStackQueue;
import DataStructures.Definitions.Linear.p04_Queue.QueueOverflowError;

import java.util.NoSuchElementException;

public class ExIntStackQueue {

    public static void enqueue(){
        System.out.println("Exercise for Enqueue in IntStackQueue");
        IntStackQueue queue = new IntStackQueue();
        System.out.println(queue);
        queue.enqueue(10);
        System.out.println(queue);
        queue.enqueue(20);
        System.out.println(queue);
        queue.enqueue(30);
        System.out.println(queue);
        queue.enqueue(40);
        System.out.println(queue);
        queue.enqueue(50);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
    }

    public static void dequeue(){
        System.out.println("Exercise for Dequeue in IntStackQueue");
        IntStackQueue queue = new IntStackQueue();
        System.out.println(queue);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        queue.enqueue(50);
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue);
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        try {
            queue.dequeue();
        }
        catch (NoSuchElementException ex){
            System.out.println("Empty queue.");
        }
        queue.enqueue(70);
        System.out.println(queue);
    }
}
