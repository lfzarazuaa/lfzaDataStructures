package DataStructures.Definitions.Linear.p04_Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class IntArrayQueue {

    int[] items;
    int count=0;
    int front=0;
    int rear=0;

    public IntArrayQueue(int size){
        items = new int[size];
    }

    public void enqueue(int item){
        if (isFull()){
            throw new QueueOverflowError();
        }
        items[rear]=item;

        incrementRear();
    }

    public int dequeue(){
        if (count<=0){
            throw new NoSuchElementException();
        }
        int item = items[front];
        items[front] = 0;
        incrementFront();
        return item;
    }

    public int peek(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        return items[front];
    }

    public boolean isEmpty(){
        return count<=0;
    }

    public boolean isFull(){
        return count>=items.length;
    }
    private void incrementFront(){
        count--;
        front=(front+1)%items.length;
    }

    private void incrementRear(){
        count++;
        rear=(rear+1)%items.length;
    }

    @Override
    public String toString() {
        return "IntArrayQueue{" +
                "items=" + Arrays.toString(items) +
                ", count=" + count +
                ", front=" + front +
                ", rear=" + rear +
                '}';
    }
}
