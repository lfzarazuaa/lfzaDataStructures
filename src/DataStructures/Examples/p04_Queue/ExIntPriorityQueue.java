package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p04_Queue.IntPriorityQueue;
import DataStructures.Definitions.Linear.p04_Queue.QueueOverflowError;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ExIntPriorityQueue {

    public static void enqueue(){
        System.out.println("Exercise for Enqueue in IntPriorityQueue");
        IntPriorityQueue queue = new IntPriorityQueue(5);
        System.out.println(queue);
        queue.enqueue(50);
        System.out.println(queue);
        queue.enqueue(30);
        System.out.println(queue);
        queue.enqueue(10);
        System.out.println(queue);
        queue.enqueue(20);
        System.out.println(queue);
        queue.enqueue(40);
        System.out.println(queue);
        try {
            queue.enqueue(50);
        }
        catch (QueueOverflowError ex){
            System.out.println("An overflow on the stack has occurred.");
        }
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        queue.enqueue(60);
        System.out.println(queue);
    }

    public static void dequeue(){
        System.out.println("Exercise for Dequeue in IntPriorityQueue");
        IntPriorityQueue queue = new IntPriorityQueue(100,false);
        List<Integer> list = new ArrayList<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println(queue);
        while (!queue.isFull()){
            int number = (int)(Math.random()*101);
            list.add(number);
            queue.enqueue(number);
        }
        System.out.println("Numbers added: "+ Arrays.toString(list.toArray()));
        System.out.println("Priority list: "+ queue);
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()){
            res.add(queue.dequeue());
        }
        System.out.println("Dequeue: "+ Arrays.toString(res.toArray()));
        try {
            queue.dequeue();
        }
        catch (NoSuchElementException ex){
            System.out.println("Empty queue.");
        }
    }

    public static void peek(){
        System.out.println("Exercise for Peek in IntPriorityQueue");
        IntPriorityQueue queue = new IntPriorityQueue(5);
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
        System.out.println("Exercise for IsEmpty in IntPriorityQueue");
        IntPriorityQueue queue = new IntPriorityQueue(5);
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
        System.out.println("Exercise for IsFull in IntPriorityQueue");
        IntPriorityQueue queue = new IntPriorityQueue(5);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.enqueue(10);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(50);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
        queue.enqueue(90);
        queue.enqueue(70);
        System.out.println(queue);
        System.out.println("IsFull: "+queue.isFull());
    }
}
