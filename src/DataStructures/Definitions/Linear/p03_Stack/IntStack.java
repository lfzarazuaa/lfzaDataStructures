package DataStructures.Definitions.Linear.p03_Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class IntStack {
    int[] items;
    int count = 0;

    public IntStack(int size){
        items = new int[size];
    }

    public void push(int item){
        if (count>=items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public int pop(){
        if (count<=0)
            throw new EmptyStackException();

        return items[--count];
    }

    public int peek(){
        if (count<=0)
            throw new EmptyStackException();

        return items[count-1];
    }

    public boolean isEmpty(){
        return count==0;
    }

    public void print(){
        if (count==0) {
            System.out.println("Empty Stack []");
            return;
        }
        int[] array = Arrays.copyOfRange(items,0,count);
        System.out.println(Arrays.toString(array));
    }
}
