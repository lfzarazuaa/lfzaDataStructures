package DataStructures.Examples.p01_Arrays;

import DataStructures.Definitions.Linear.p01_Arrays.IntArray;

public class ExIntArrays {
    public static void testInsert() {
        IntArray numbers = new IntArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        System.out.println("Test Insert");
        numbers.print();
    }

    public static void testRemoveAt() {
        IntArray numbers = new IntArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        System.out.println("Test Remove");
        numbers.print();
        System.out.println("Remove index 1");
        numbers.removeAt(1);
        numbers.print();
        System.out.println("Remove index 3");
        numbers.removeAt(3);
        numbers.print();
        try {
            numbers.removeAt(5);
        } catch (IllegalArgumentException e) {
            System.out.println("Cannot remove index at 5");
        }
    }

    public static void testIndexOf() {
        IntArray numbers = new IntArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        System.out.println("Index of 10 is: " + numbers.indexOf(10));
        System.out.println("Index of 100 is: " + numbers.indexOf(100));
    }

    public static void testMax() {
        IntArray numbers = new IntArray(3);
        numbers.insert(80);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        System.out.println("Test the max in Array");
        System.out.println("Max of array is: " + numbers.max());
    }

    public static void testDistinct() {
        IntArray numbers = new IntArray(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(10);
        numbers.insert(20);
        System.out.println("Test distinct in Array");
        numbers.print();
        System.out.println("Distinct array is: ");
        numbers.distinct().print();
    }

    public static void testIntersect() {
        IntArray numbersA = new IntArray(3);
        numbersA.insert(10);
        numbersA.insert(20);
        numbersA.insert(30);
        numbersA.insert(10);
        numbersA.insert(20);
        IntArray numbersB = new IntArray(3);
        numbersB.insert(20);
        numbersB.insert(40);
        numbersB.insert(50);
        numbersB.insert(10);
        numbersB.insert(70);
        System.out.println("Test Intersect");
        numbersA.print();
        numbersB.print();
        System.out.println("Intersect array is: ");
        numbersA.intersect(numbersB).print();
    }

    public static void testReverse() {
        IntArray numbersA = new IntArray(3);
        numbersA.insert(10);
        numbersA.insert(20);
        numbersA.insert(30);
        numbersA.insert(40);
        numbersA.insert(50);
        System.out.println("Test Reverse");
        numbersA.print();
        System.out.println("Reverse array is: ");
        numbersA.reverse();
        numbersA.print();
    }
    public static void testInsertAt() {
        IntArray numbersA = new IntArray(3);
        numbersA.insert(10);
        numbersA.insert(20);
        numbersA.insert(30);
        System.out.println("Test Reverse");
        numbersA.print();
        System.out.println("Inserting 40 on index 3: ");
        numbersA.insertAt(40, 3);
        numbersA.print();
        System.out.println("Inserting 50 on index 1: ");
        numbersA.insertAt(40, 1);
        numbersA.print();
        try {
            System.out.println("Inserting 100 on index -1: ");
            numbersA.insertAt(100, -1);
        }
        catch (IllegalArgumentException e){
            System.out.println("Not valid index.");
        }
        try {
            System.out.println("Inserting 1000 on index 100: ");
            numbersA.insertAt(1000, 100);
        }
        catch (IllegalArgumentException e){
            System.out.println("Not valid index.");
        }

    }
}
