package DataStructures.Definitions.Linear.p03_Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    T[] items;
    int count = 0;

    public Stack(int size){
        items = (T[]) new Object[size];
    }

    public void push(T item){
        if (count>=items.length)
            throw new StackOverflowError();

        items[count++] = item;
    }

    public T pop(){
        if (count<=0)
            throw new EmptyStackException();

        return items[--count];
    }

    public T peek(){
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
        T[] array = Arrays.copyOfRange(items,0,count);
        System.out.println(Arrays.toString(array));
    }
}
