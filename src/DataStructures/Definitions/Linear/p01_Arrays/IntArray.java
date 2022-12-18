package DataStructures.Definitions.Linear.p01_Arrays;

public class IntArray {
    private int[] items;
    private int count = 0;

    public IntArray(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
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

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item)
                return i;
        }
        return -1;
    }

    public int max() {
        if (count < 1) {
            throw new IllegalArgumentException("No elements in the array.");
        }

        int max = items[0];

        for (int i = 1; i < count; i++) {
            if (items[i] > max)
                max = items[i];
        }
        return max;
    }

    public IntArray intersect(IntArray arrayB) {
        if (this.count < 1 || arrayB.count < 1) {
            return new IntArray(1);
        }
        IntArray arr1 = this.distinct();
        IntArray arr2 = arrayB.distinct();
        IntArray result = new IntArray(count);

        for (int i = 0; i < arr1.count; i++) {
            for (int j = 0; j < arr2.count; j++) {
                if (arr1.items[i] == arr2.items[j]) {
                    result.insert(arr1.items[i]);
                    break;
                }
            }
        }
        return result;
    }

    public IntArray distinct() {
        IntArray result = new IntArray(this.count);
        for (int i = 0; i < this.count; i++) {
            if (!result.exist(items[i]))
                result.insert(items[i]);
        }
        return result;
    }

    public boolean exist(int item) {
        return indexOf(item) >= 0;
    }

    public void reverse() {
        int[] newItems = new int[count];
        int maxIndex = count-1;
        for (int i = 0; i < this.count; i++) {
            newItems[i] = items[maxIndex-i];
        }
        items = newItems;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index > count)
            throw new IllegalArgumentException("Index Out of Range");

        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        int maxIndex = count-1;

        for (int i = maxIndex; i >= index; i--) {
            items[i+1] = items[i];
        }
        items[index]=item;
        count++;
    }

    public void print() {
        System.out.println("Array elements are:");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

}
