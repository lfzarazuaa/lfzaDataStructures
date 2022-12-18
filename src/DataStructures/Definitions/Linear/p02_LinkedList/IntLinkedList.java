package DataStructures.Definitions.Linear.p02_LinkedList;

import java.util.NoSuchElementException;

public class IntLinkedList {
    private static class Node {
        public int value;
        public Node next;
        public Node(int value){
            this.value = value;
        }

        public String getNext(){
            if (next==null)
                return null;
            return String.valueOf(this.hashCode());
        }
    }

    private Node first;
    private Node last;
    private int size = 0;
    public IntLinkedList(){

    }

    public void addLast(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node; // Insert new node.
            last = node; // Update pointer of last node.
        }
        size++;
    }

    public void addFirst(int item){
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else{
            node.next = first;// Update reference.
            first = node;// Insert new node.
        }
        size++;
    }

    public int indexOf(int item){
        int index = 0;
        Node current = first;
        while (current != null){
            if (current.value == item)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item)>=0;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public boolean isSingleElement(){
        return first != null && first.next == null;
    }

    public void removeFirst(){
        if (isEmpty())
            throw new NoSuchElementException();

        if(isSingleElement()) {
            first = last = null;
            size--;
            return;
        }
        Node second = first.next;
        first.next = null; // Eliminate reference for garbage collector.
        first = second; // Make second the first.
        size--;
    }

    public void removeLast(){
        if (isEmpty())
            throw new NoSuchElementException();

        if(isSingleElement()) {
            first = last = null;
            size--;
            return;
        }

        Node previousOfLast = getPrevious(last);
        previousOfLast.next = null;
        last = previousOfLast;
        size--;
    }

    private Node getPreviousOfLast(Node beginNode){
        Node current = beginNode;
        while (current.next!=last){
            if (current.next==null)
                throw new NoSuchElementException();
            current = current.next;
        }
        return current;
    }

    private Node getPrevious(Node node){
        Node current = first;
        while (current.next!=node){
            if (current.next==null)
                throw new NoSuchElementException();
            current = current.next;
        }
        return current;
    }

    public int getSize(){
        if (isEmpty()){
            return 0;
        }
        Node current = first;
        int index = 1;
        while (current.next!=null){
            current = current.next;
            index++;
        }
        return index;
    }

    public int size(){
        return size;
    }

    public void reverse(){
        // [10 -> 20 -> 30 -> 40]
        // [10    20 -> 30 -> 40]
        // [10 <- 20 -> 30 -> 40]
        // [10 <- 20    30 -> 40]
        // [10 <- 20 <- 30 -> 40]
        // [10 <- 20 <- 30    40]
        // [10 <- 20 <- 30 <- 40]

        // For empty or single elements
        if (isEmpty() || isSingleElement())
            return;
        Node originalFirst = first;
        Node originalLast = last;

        Node previous = first;
        Node current = first.next;

        while (current != null){
            // Store reference
            Node next = current.next;

            // Change direction
            current.next = previous;

            // Iterate forward
            previous = current;
            current = next;
        }

        first = originalLast;
        last = originalFirst;
        last.next=null;
        //return array;
    }

    public int getKthFromTheEnd(int k){
        if (isEmpty())
            throw new IllegalStateException();

        if (k<=0)
            throw new IllegalArgumentException();

        Node current = first;

        // Go to kth node
        for (int i = 0; i < k - 1; i++) {
            current = current.next;
            if (current==null)
                throw new IllegalArgumentException();
        }

        Node kNode = first;

        while (current.next != null){
            current = current.next;
            kNode = kNode.next;
        }

        return kNode.value;
    }

    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while (current!=null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void printMiddle() {
        if (isEmpty())
            throw new IllegalStateException();

        var a = first;
        var b = first;
        while (b != last && b.next != last) {
            b = b.next.next;
            a = a.next;
        }

        if (b == last)
            System.out.println(a.value);
        else
            System.out.println(a.value + ", " + a.next.value);
    }

    public boolean hasLoop() {
        var slow = first;
        var fast = first;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static IntLinkedList createWithLoop() {
        var list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Get a reference to 30
        var node = list.last;

        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        list.addLast(80);
        list.addLast(90);
        list.addLast(100);
        list.addLast(110);

        // Create the loop
        list.last.next = node;

        return list;
    }

    public void print(){
        if (first == null){
            System.out.println("No elements in the list.");
            return;
        }
        int index=0;
        Node current = first;
        System.out.println("Value: " + current.value + ", Index = " + index + ", Next = " + current.getNext());
        while (current.next!=null){
            current = current.next;
            System.out.println("Value: " + current.value + ", Index = " + ++index + ", Next = " + current.getNext());
        }
    }
}
