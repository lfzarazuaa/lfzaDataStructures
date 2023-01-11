package DataStructures.Definitions.Linear.p04_Queue;

import DataStructures.Definitions.Utils;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class IntPriorityQueue {

    boolean ascOrder;
    int[] items;
    int count=0;

    public IntPriorityQueue(int size){
        items = new int[size];
        ascOrder=true;
    }

    public IntPriorityQueue(int size,boolean asc){
        items = new int[size];
        ascOrder=asc;
    }
    public void enqueue(int item){
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

    public int dequeue(){
        if (count<=0){
            throw new NoSuchElementException();
        }
        int item = items[--count];
        items[count] = 0;
        return item;
    }

    public int peek(){
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
    private int findIndex(int item){
        return ascOrder?Utils.binarySearchIndex(items,item,count)
                :Utils.binarySearchIndexDesc(items,item,count);
    }

    private void insertAt(int value, int index){
        for (int i = count - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }
        items[index]=value;
    }

    @Override
    public String toString() {
        return "IntPriorityQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                '}';
    }
}
