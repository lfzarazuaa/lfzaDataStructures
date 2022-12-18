package DataStructures.Examples.p02_LinkedList;

public class ExLinkedList {
    public static void main(String[] args) {
        System.out.println("Exercises for Linked List");
        testIntLinkedList();
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
