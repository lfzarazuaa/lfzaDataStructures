package DataStructures.Examples.p02_LinkedList;

public class ExLinkedList {
    public static void main(String[] args) {
        System.out.println("Exercises for Linked List");
        testIntLinkedList();
        testGenericLinkedList();
    }

    private static void testGenericLinkedList() {
        ExGenericLinkedList.testAddLast();
        ExGenericLinkedList.testAddFirst();
        ExGenericLinkedList.indexOf();
        ExGenericLinkedList.contains();
        ExGenericLinkedList.removeFirst();
        ExGenericLinkedList.removeLast();
        ExGenericLinkedList.size();
        ExGenericLinkedList.reverse();
        ExGenericLinkedList.findKthNode();
        ExGenericLinkedList.toArray();
        ExGenericLinkedList.printMiddle();
        ExGenericLinkedList.hasLoop();
    }

    private static void testIntLinkedList(){
        ExIntLinkedList.testAddLast();
        ExIntLinkedList.testAddFirst();
        ExIntLinkedList.indexOf();
        ExIntLinkedList.contains();
        ExIntLinkedList.removeFirst();
        ExIntLinkedList.removeLast();
        ExIntLinkedList.size();
        ExIntLinkedList.toArray();
        ExIntLinkedList.reverse();
        ExIntLinkedList.findKthNode();
        ExIntLinkedList.printMiddle();
        ExIntLinkedList.hasLoop();
    }
}
