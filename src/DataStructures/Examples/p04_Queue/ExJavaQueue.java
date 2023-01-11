package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Linear.p04_Queue.IntPriorityQueue;
import DataStructures.Examples.p03_Stacks.ExJavaStack;

import java.util.*;

public class ExJavaQueue {
    public static void reverseQueueTest(){
        System.out.println("Exercise for Reverse Queue");
        var queue = new ArrayDeque<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(Arrays.toString(queue.toArray()));
        System.out.println(Arrays.toString(reverse(queue).toArray()));

        var strQueue = new ArrayDeque<Character>();
        for (var character:"AnitaLavaLaTina".toCharArray()) {
            strQueue.add(character);
        }
        System.out.println(Arrays.toString(strQueue.toArray()));
        System.out.println(Arrays.toString(reverse(strQueue).toArray()));

    }

    private static <T> Queue<T> reverse(Queue<T> queue){
        Stack<T> reverser = new Stack<T>();
        while (!queue.isEmpty())
           reverser.push(queue.remove());
        while (!reverser.isEmpty())
            queue.add(reverser.pop());
        return queue;
    }

    public static void priorityQueueTest(){
        System.out.println("Exercise for Priority Queue");
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        list.add(50);
        queue.add(50);
        list.add(10);
        queue.add(10);
        list.add(40);
        queue.add(40);
        list.add(30);
        queue.add(30);
        list.add(20);
        queue.add(20);
        System.out.println("Adding elements: " + Arrays.toString(list.toArray()));
        while (!queue.isEmpty())
            resultList.add(queue.remove());
        System.out.println("Retrieving from queue: " + Arrays.toString(resultList.toArray()));

    }

    public static void reverseFirstKElementsTest(){
        System.out.println("Exercise for reverse First K elements in Queue");
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue Content: " + queue);
        reverseFirstKElements(queue,3);
        System.out.println("Reversing First 3 elements: " + queue);
        reverseFirstKElements(queue,2);
        System.out.println("Reversing First 2 elements: " + queue);
        reverseFirstKElements(queue,4);
        System.out.println("Reversing First 4 elements: " + queue);
        reverseFirstKElements(queue,5);
        System.out.println("Reversing First 5 elements: " + queue);
        try {
            System.out.println("Reversing First 6 elements: ");
            reverseFirstKElements(queue,6);
        }
        catch (IllegalArgumentException ex){
            System.out.println("Index out of range.");
        }
    }

    private static <T> void reverseFirstKElements(Queue<T> queue,int k){
        Stack<T> stack = new Stack<>();
        if (k> queue.size())
            throw new IllegalArgumentException();
        // Q [10,20,30,40,50]
        // S []
        for (int i = 0; i < k; i++) {
            stack.add(queue.remove());
        }
        // Q [40,50]
        // S [10,20,30]
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
        // Q [40,50,30,20,10]
        // S []
        for (int i = 0; i < queue.size()-k; i++) {
            queue.add(queue.remove());
        }
        // Q [30,20,10,40,50]
        // S []
    }

}
