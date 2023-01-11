package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p04_Queue.IntArrayQueue;
import DataStructures.Definitions.Linear.p04_Queue.QueueOverflowError;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class ExIntArrayQueue {

    public static void enqueue(){
        System.out.println("Exercise for Enqueue in IntArrayQueue");
        IntArrayQueue queue = new IntArrayQueue(5);
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
        try {
            queue.enqueue(50);
        }
        catch (QueueOverflowError ex){
            System.out.println("An overflow on the stack has occurred.");
        }
        System.out.println(queue.dequeue());
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue);
    }

    public static void dequeue(){
        System.out.println("Exercise for Dequeue in IntArrayQueue");
        IntArrayQueue queue = new IntArrayQueue(5);
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

    public static void peek(){
        System.out.println("Exercise for Dequeue in IntArrayQueue");
        IntArrayQueue queue = new IntArrayQueue(5);
        System.out.println(queue);
        try {
            System.out.println("Peek element: "+queue.peek());
        }
        catch (NoSuchElementException ex){
            System.out.println("Cannot peek, empty queue.");
        }
        queue.enqueue(10);
        System.out.println("Peek element: "+queue.peek());
        System.out.println("Dequeue element: "+queue.dequeue());
        try {
            System.out.println("Peek element: "+queue.peek());
        }
        catch (NoSuchElementException ex){
            System.out.println("Cannot peek, empty queue.");
        }
        queue.enqueue(20);
        System.out.println(queue);
        System.out.println("Peek element: "+queue.peek());
    }

    public static void isEmpty(){
        System.out.println("Exercise for IsEmpty in IntArrayQueue");
        IntArrayQueue queue = new IntArrayQueue(5);
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
        queue.enqueue(10);
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
        queue.dequeue();
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
    }

    public static void isFull(){
        System.out.println("Exercise for IsFull in IntArrayQueue");
        IntArrayQueue queue = new IntArrayQueue(5);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.enqueue(10);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.enqueue(60);
        queue.enqueue(70);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
    }
}
