package DataStructures.Definitions.Linear.p04_Queue;

import DataStructures.Definitions.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class PriorityQueue <T extends Comparable<? super T>>{

    private final boolean ascOrder;
    private final T[] items;
    private int count=0;

    public PriorityQueue(T[] items){
        this.items = items;
        ascOrder=true;
    }

    public PriorityQueue(T[] items, boolean asc){
        this.items = items;
        ascOrder = asc;
    }
    public void enqueue(T item){
        if (isFull()){
            throw new QueueOverflowError();
        }
        if (isEmpty()){
            items[0]=item;
        }
        else {
            int index = findIndex(item);
            insertAt(item, index);
        }
        count++;
    }

    public T dequeue(){
        if (count<=0){
            throw new NoSuchElementException();
        }
        T item = items[--count];
        items[count] = null;
        return item;
    }

    public T peek(){
        if (count<=0){
            throw new NoSuchElementException();
        }
        return items[count-1];
    }

    public boolean isEmpty(){
        return count<=0;
    }

    public boolean isFull(){
        return count>=items.length;
    }
    private int findIndex(T item){
        return ascOrder?Utils.binarySearchIndexIComparableAsc(items,item,count)
                :Utils.binarySearchIndexIComparableDesc(items,item,count);
    }

    private void insertAt(T value, int index){
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index]=value;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
