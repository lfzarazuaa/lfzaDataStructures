package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p04_Queue.IntPriorityQueue;
import DataStructures.Definitions.Linear.p04_Queue.PriorityQueue;
import DataStructures.Definitions.Linear.p04_Queue.QueueOverflowError;
import DataStructures.Models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class ExGenericPriorityQueue {

    public static void enqueue(){
        System.out.println("Exercise for Enqueue in GenericPriorityQueue");
        PriorityQueue<Person> queue = new PriorityQueue<>(new Person[5]);
        System.out.println(queue);
        queue.enqueue(new Person("A",50,170));
        System.out.println(queue);
        queue.enqueue(new Person("B",30,170));
        System.out.println(queue);
        queue.enqueue(new Person("C",10,170));
        System.out.println(queue);
        queue.enqueue(new Person("D",20,170));
        System.out.println(queue);
        queue.enqueue(new Person("E",40,170));
        System.out.println(queue);
        try {
            queue.enqueue(new Person("F",50,170));
        }
        catch (QueueOverflowError ex){
            System.out.println("An overflow on the stack has occurred.");
        }
        System.out.println("Dequeue element: " +queue.dequeue());
        System.out.println(queue);
        queue.enqueue(new Person("G",60,170));
        System.out.println(queue);
    }

    public static void dequeue(){
        System.out.println("Exercise for Dequeue in GenericPriorityQueue");
        PriorityQueue<Person> queue = new PriorityQueue<>(new Person[100],false);
        List<Integer> list = new ArrayList<>();
        queue.enqueue(new Person("A",10,170));
        queue.enqueue(new Person("B",20,170));
        queue.enqueue(new Person("C",30,170));
        queue.enqueue(new Person("D",40,170));
        System.out.println(queue);
        while (!queue.isFull()){
            int number = (int)(Math.random()*101);
            list.add(number);
            queue.enqueue(new Person("N"+number,number,170));
        }
        System.out.println("Ages added: "+ Arrays.toString(list.toArray()));
        System.out.println("Priority list: "+ queue);
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()){
            res.add(queue.dequeue().getAge());
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
        System.out.println("Exercise for Peek in GenericPriorityQueue");
        PriorityQueue<Person> queue = new PriorityQueue<>(new Person[5]);
        System.out.println(queue);
        try {
            System.out.println("Peek element: "+queue.peek());
        }
        catch (NoSuchElementException ex){
            System.out.println("Cannot peek, empty queue.");
        }
        queue.enqueue(new Person("A",10,170));
        System.out.println("Peek element: "+queue.peek());
        System.out.println("Dequeue element: "+queue.dequeue());
        try {
            System.out.println("Peek element: "+queue.peek());
        }
        catch (NoSuchElementException ex){
            System.out.println("Cannot peek, empty queue.");
        }
        queue.enqueue(new Person("B",20,170));
        System.out.println(queue);
        System.out.println("Peek element: "+queue.peek());
    }

    public static void isEmpty(){
        System.out.println("Exercise for IsEmpty in GenericPriorityQueue");
        PriorityQueue<Person> queue = new PriorityQueue<>(new Person[5]);
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
        queue.enqueue(new Person("A",10,170));
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
        System.out.println("Dequeue element: "+queue.dequeue());
        System.out.println(queue);
        System.out.println("IsEmpty: "+queue.isEmpty());
    }

    public static void isFull(){
        System.out.println("Exercise for IsFull in GenericPriorityQueue");
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Integer[5]);
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
