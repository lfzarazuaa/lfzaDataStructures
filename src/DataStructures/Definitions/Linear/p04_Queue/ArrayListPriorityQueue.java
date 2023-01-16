package DataStructures.Definitions.Linear.p04_Queue;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPriorityQueue<T extends Comparable<T>> {
    private final List<T> queue;

    public ArrayListPriorityQueue() {
        this(10);
    }

    public ArrayListPriorityQueue(int initialSize) {
        queue = new ArrayList<T>(initialSize);
    }

    public void enqueue(T item) {
        int threshold = 12343;
        if (queue.size() < threshold) {
            int index = -1;
            for (int i = 0; i < queue.size(); i++) {
                if (queue.get(i).compareTo(item) >= 0) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                queue.add(index, item);
            } else {
                queue.add(item);
            }
        } else {
            int index = Collections.binarySearch(queue, item);
            if (index < 0) {
                index = -(index + 1);
            }
            queue.add(index, item);
        }
    }

    public T dequeue() {
        T item = queue.get(0);
        queue.remove(0);
        return item;
    }
}