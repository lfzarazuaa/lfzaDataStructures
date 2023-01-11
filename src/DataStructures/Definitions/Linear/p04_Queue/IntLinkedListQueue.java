package DataStructures.Definitions.Linear.p04_Queue;

import DataStructures.Definitions.Linear.p02_LinkedList.IntLinkedList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class IntLinkedListQueue {
    private static class Node {
        public int value;
        public Node next;
        public Node(int value){
            this.value = value;
        }

        public String getNext(){
            if (next==null)
                return null;
            return String.valueOf(this.hashCode());
        }
    }
    private Node first;
    private Node last;
    private int size = 0;

    public IntLinkedListQueue(){

    }

    public void enqueue(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node; // Insert new node.
            last = node; // Update pointer of last node.
        }
        size++;
    }

    public int dequeue(){
        if (isEmpty())
            throw new NoSuchElementException();

        int result = first.value;

        if(isSingleElement()) {
            first = last = null;
            size--;
            return result;
        }

        Node second = first.next;
        first.next = null; // Eliminate reference for garbage collector.
        first = second; // Make second the first.
        size--;
        return result;
    }

    public int peek(){
        if (isEmpty())
            throw new NoSuchElementException();
        return first.value;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public boolean isSingleElement(){
        return first != null && first.next == null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current!=null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    @Override
    public String toString() {
        return "IntLinkedListQueue{" +
                "items=" + Arrays.toString(this.toArray()) +
                ", size=" + size +
                '}';
    }
}
