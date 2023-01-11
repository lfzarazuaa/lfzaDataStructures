package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p04_Queue.IntLinkedListQueue;

import java.util.NoSuchElementException;

public class ExIntLinkedListQueue {

    public static void enqueue(){
        System.out.println("Exercise for Enqueue in IntLinkedListQueue");
        IntLinkedListQueue queue = new IntLinkedListQueue();
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
    }

    public static void dequeue(){
        System.out.println("Exercise for Dequeue in IntLinkedListQueue");
        IntLinkedListQueue queue = new IntLinkedListQueue();
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
        System.out.println("Exercise for Dequeue in IntLinkedListQueue");
        IntLinkedListQueue queue = new IntLinkedListQueue();
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
        System.out.println("Exercise for IsEmpty in IntLinkedListQueue");
        IntLinkedListQueue queue = new IntLinkedListQueue();
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
        queue.enqueue(10);
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
        queue.dequeue();
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
    }

}
