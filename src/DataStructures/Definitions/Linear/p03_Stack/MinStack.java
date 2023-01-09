package DataStructures.Definitions.Linear.p03_Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MinStack {

    int[] items;
    int count=0;

    public MinStack(int totalSize) {
        items = new int[totalSize];
    }


    public void push(int item) {
        // [0,0,0,0,0] count=0
        // [5,0,0,0,0] count=1
        // [5,2,0,0,0] count=2
        //  1 0         indexDeep
        //  0 1         insertAt = count - indexDeep
        // [7,5,2,0,0] count=3
        //  2 1 0       indexDeep
        //  0 1 2       insertAt = indexDeep
        // [8,7,5,2,0]
        //  3 2 1 0     indexDeep
        //  0 1 2 3     insertAt = 3 - indexDeep
        // [8,7,6,5,2]
        //  4 3 2 1 0   indexDeep
        //  0 1 2 3 4   insertAt = 3 - indexDeep
        if (count==items.length)
            throw new StackOverflowError();

        int i;
        for ( i = 0; i < count; i++) {
            if (item>=items[i])
                break;
        }
        insertAt(item,i);
        count++;

    }

    public int pop(){
        if (count<=0)
            throw new EmptyStackException();

        return items[--count];
    }

    public int min(){
        if (count<=0)
            throw new EmptyStackException();

        return items[count-1];
    }

    private void insertAt(int item,int index){
        for (int i = count-1; i >= index; i--) {
            items[i+1] = items[i];
        }
        items[index]=item;
    }

    @Override
    public String toString() {
        var stack = Arrays.copyOfRange(items,0,count);
        return "MinStack{" +
                "items=" + Arrays.toString(items) +
                ", stack=" + Arrays.toString(stack) +
                ", count=" + count +
                '}';
    }
}
