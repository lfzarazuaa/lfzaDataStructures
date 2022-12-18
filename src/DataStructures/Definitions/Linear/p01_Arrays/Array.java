package DataStructures.Definitions.Linear.p01_Arrays;



public class Array<T> {
    private T[] items;
    private int count = 0;

    public Array(int length) {
        items = (T[]) new Object[length];
    }

    public void insert(T item) {
        if (items.length == count) {
            T[] newItems = (T[]) new Object[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException("Index Out of Range");

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(T item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public void reverse() {
        T[] newItems = (T[]) new Object[count];
        int maxIndex = count-1;
        for (int i = 0; i < this.count; i++) {
            newItems[i] = items[maxIndex-i];
        }
        items = newItems;
    }

    public void insertAt(T item, int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException("Index Out of Range");

        if (items.length == count) {
            T[] newItems = (T[]) new Object[count*2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        int maxIndex = count-1;

        for (int i = maxIndex; i >= index; i--) {
            items[i+1] = items[i];
        }
        items[index] = item;
        count++;
    }

    public void print() {
        System.out.println("Array elements are:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }


}
