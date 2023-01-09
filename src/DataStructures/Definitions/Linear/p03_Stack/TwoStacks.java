package DataStructures.Definitions.Linear.p03_Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStacks {

    int[] items;
    int count1=0;
    int count2=0;

    public TwoStacks(int totalSize) {
        items = new int[totalSize];
    }

    public void push1(int item) {
        if (isItemsArrayFull())
            throw new StackOverflowError();

        items[count1] = item;
        count1++;
    }

    public void push2(int item) {
        if (isItemsArrayFull())
            throw new StackOverflowError();
        int index = items.length-count2-1;
        items[index] = item;
        count2++;
    }

    public int pop1() {
        if (count1==0)
            throw new EmptyStackException();

        count1--;

        int result = items[count1];
        items[count1]=0;
        return result;

    }

    public int pop2() {
        if (count2==0)
            throw new EmptyStackException();

        count2--;
        int index = items.length-count2-1;

        int result = items[index];
        items[index]=0;
        return result;

    }

    public boolean isEmpty1() {
        return count1==0;
    }

    public boolean isEmpty2() { return count2==0; }

    public boolean isFull1() {
        return isItemsArrayFull();
    }

    public boolean isFull2() { return isItemsArrayFull(); }

    private boolean isItemsArrayFull(){
        return count1 + count2 >= items.length;
    }

    @Override
    public String toString() {
        return "TwoStacks{" +
                "items=" + Arrays.toString(items) +
                ", count1=" + count1 +
                ", count2=" + count2 +
                '}';
    }
}
