package DataStructures.Examples.p01_Arrays;

public class ExArrays {

    public static void main(String[] args) {
        System.out.println("Exercises for Arrays");
        testIntArray();
        testGenericArray();
    }

    private static void testGenericArray() {
        ExGenericArray.testInsert();
        ExGenericArray.testRemoveAt();
        ExGenericArray.testIndexOf();
        ExGenericArray.testReverse();
        ExGenericArray.testInsertAt();
    }

    private static void testIntArray(){
        ExIntArrays.testInsert();
        ExIntArrays.testRemoveAt();
        ExIntArrays.testIndexOf();
        ExIntArrays.testMax();
        ExIntArrays.testDistinct();
        ExIntArrays.testIntersect();
        ExIntArrays.testReverse();
        ExIntArrays.testInsertAt();
    }
}
