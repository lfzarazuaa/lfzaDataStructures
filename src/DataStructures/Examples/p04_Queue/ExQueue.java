package DataStructures.Examples.p04_Queue;

import DataStructures.Definitions.Utils;

public class ExQueue {

    public static void main(String[] args) {
        System.out.println("Exercises for Queue");
        testJavaQueue();
        testIntArrayQueue();
        testStackArrayQueue();
        priorityQueueTest();
        Utils.binarySearchIndexTest();
        testIntPriorityQueue();
        testReverseFirstKElements();
        testIntLinkedListQueue();
        testIntStackTwoQueues();
        Utils.binarySearchIndexIComparableTest();
        testPriorityQueue();
    }

    private static void testPriorityQueue() {
        ExGenericPriorityQueue.enqueue();
        ExGenericPriorityQueue.dequeue();
        ExGenericPriorityQueue.peek();
        ExGenericPriorityQueue.isEmpty();
        ExGenericPriorityQueue.isFull();
    }

    private static void testIntStackTwoQueues() {
        ExIntTwoQueuesStack.push();
        ExIntTwoQueuesStack.pop();
        ExIntTwoQueuesStack.peek();
        ExIntTwoQueuesStack.isEmpty();
    }

    private static void testIntLinkedListQueue() {
        ExIntLinkedListQueue.enqueue();
        ExIntLinkedListQueue.dequeue();
        ExIntLinkedListQueue.peek();
        ExIntLinkedListQueue.isEmpty();
    }

    private static void testReverseFirstKElements() {
        ExJavaQueue.reverseFirstKElementsTest();
    }

    private static void testIntPriorityQueue() {
        ExIntPriorityQueue.enqueue();
        ExIntPriorityQueue.dequeue();
        ExIntPriorityQueue.peek();
        ExIntPriorityQueue.isEmpty();
        ExIntPriorityQueue.isFull();
    }

    private static void priorityQueueTest() {
        ExJavaQueue.priorityQueueTest();
    }

    private static void testStackArrayQueue() {
        ExIntStackQueue.enqueue();
        ExIntStackQueue.dequeue();
    }

    private static void testIntArrayQueue() {
        ExIntArrayQueue.enqueue();
        ExIntArrayQueue.dequeue();
        ExIntArrayQueue.peek();
        ExIntArrayQueue.isEmpty();
        ExIntArrayQueue.isFull();
    }

    private static void testJavaQueue() {
        ExJavaQueue.reverseQueueTest();
    }
}
