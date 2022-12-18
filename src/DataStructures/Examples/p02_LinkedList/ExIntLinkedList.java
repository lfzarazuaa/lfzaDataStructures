package DataStructures.Examples.p02_LinkedList;

import DataStructures.Definitions.Linear.p02_LinkedList.IntLinkedList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ExIntLinkedList {
    public static void testAddLast() {
        System.out.println("Test Add Last to Linked List: LLA");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.print();
        System.out.println("Test Add Last to Linked List: LLB");
        IntLinkedList list2 = new IntLinkedList();
        list2.addLast(10);
        list2.print();
    }

    public static void testAddFirst() {
        System.out.println("Test Add First to Linked List: LLA");
        IntLinkedList list = new IntLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.print();
        System.out.println("Test Add First to Linked List: LLB");
        IntLinkedList list2 = new IntLinkedList();
        list2.addFirst(10);
        list2.print();
    }

    public static void indexOf() {
        System.out.println("Test indexOf on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.print();
        System.out.println("Index of 20 = " + list.indexOf(20));
        System.out.println("Index of 50 = " + list.indexOf(50));
        System.out.println("Index of 100 = " + list.indexOf(100));
    }

    public static void contains() {
        System.out.println("Test contains on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.print();
        System.out.println("Contains 20 = " + list.contains(20));
        System.out.println("Contains 50 = " + list.contains(50));
        System.out.println("Contains 100 = " + list.contains(100));
    }

    public static void removeFirst() {
        System.out.println("Test removeFirst on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.print();
        System.out.println("Remove first");
        list.removeFirst();
        list.print();
        System.out.println("Remove first");
        list.removeFirst();
        list.print();
        System.out.println("Remove first");
        list.removeFirst();
        list.print();
        try {
            System.out.println("Remove first");
            list.removeFirst();
            list.print();
        } catch (NoSuchElementException e) {
            System.out.println("No elements to remove in the list.");
        }

    }

    public static void removeLast() {
        System.out.println("Test removeLast on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.print();
        System.out.println("Remove last");
        list.removeLast();
        list.print();
        System.out.println("Remove last");
        list.removeLast();
        list.print();
        System.out.println("Remove last");
        list.removeLast();
        list.print();
        try {
            System.out.println("Remove last");
            list.removeLast();
            list.print();
        } catch (NoSuchElementException e) {
            System.out.println("No elements to remove in the list.");
        }

    }

    public static void size() {
        System.out.println("Test size on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.print();
        System.out.println("Size on list = " + list.size());
        list.addLast(10);
        list.print();
        System.out.println("Size on list = " + list.size());
        list.addLast(20);
        list.print();
        System.out.println("Size on list = " + list.size());
        list.addLast(30);
        list.print();
        System.out.println("Size on list = " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Size on list = " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Size on list = " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Size on list = " + list.size());
        list.addFirst(40);
        list.print();
        System.out.println("Size on list = " + list.size());
        list.addFirst(50);
        list.print();
        System.out.println("Size on list = " + list.size());
        list.addFirst(60);
        list.print();
        System.out.println("Size on list = " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Size on list = " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Size on list = " + list.size());
        list.removeFirst();
        list.print();
        System.out.println("Size on list = " + list.size());
    }

    public static void toArray() {
        System.out.println("Test toArray on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.print();
        System.out.println(Arrays.toString(list.toArray()));

    }

    public static void reverse() {
        System.out.println("Test reverse on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.print();
        System.out.println("Reversing Linked List");
        list.reverse();
        list.print();
    }

    public static void findKthNode() {
        System.out.println("Test findKthNode on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.print();
        try {
            System.out.print("Find last 1 Node = ");
            list.getKthFromTheEnd(1);
        }
        catch (IllegalStateException e){
            System.out.println("No elements on the list.");
        }
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.print();
        try {
            System.out.print("Find last -1 Node = ");
            list.getKthFromTheEnd(-1);
        }
        catch (IllegalArgumentException e){
            System.out.println("No valid index -1");
        }
        System.out.println("Find last 1 Node = " + list.getKthFromTheEnd(1));
        System.out.println("Find last 2 Node = " + list.getKthFromTheEnd(2));
        System.out.println("Find last 3 Node = " + list.getKthFromTheEnd(3));
        System.out.println("Find last 4 Node = " + list.getKthFromTheEnd(4));
        try {
            System.out.print("Find last 5 Node = ");;
            list.getKthFromTheEnd(5);
        }
        catch (IllegalArgumentException e){
            System.out.println("No valid index 5");
        }
        try {
            System.out.print("Find last 100 Node = ");;
            list.getKthFromTheEnd(100);
        }
        catch (IllegalArgumentException e){
            System.out.println("No valid index 100");
        }

    }

    public static void printMiddle() {
        System.out.println("Test printMiddle on Linked List");
        IntLinkedList list = new IntLinkedList();
        list.print();
        try {
            System.out.print("Print for no elements = ");
            list.printMiddle();
        }
        catch (IllegalStateException e){
            System.out.println("No elements on the list.");
        }
        list.addLast(10);
        list.print();
        System.out.print("PrintMiddle for 1 elements, ");
        list.printMiddle();

        list.addLast(20);
        list.print();
        System.out.print("PrintMiddle for 2 elements, ");
        list.printMiddle();

        list.addLast(30);
        list.print();
        System.out.print("PrintMiddle for 3 elements, ");
        list.printMiddle();

        list.addLast(40);
        list.print();
        System.out.print("PrintMiddle for 4 elements, ");
        list.printMiddle();

    }

    public static void hasLoop() {
        System.out.println("Test hasLoop on Linked List");
        IntLinkedList list = new IntLinkedList();
        System.out.println("Has loop on empty Linked List " + list.hasLoop());
        list.addLast(5);
        System.out.println("Has loop on 1 element Linked List " + list.hasLoop());
        list.addLast(10);
        list.addLast(15);
        list.addLast(20);
        list.addLast(25);
        System.out.println("Has loop on many elements Linked List " + list.hasLoop());
        IntLinkedList listB = IntLinkedList.createWithLoop();
        System.out.println("Has loop on many elements looped Linked List " + listB.hasLoop());
    }
}
