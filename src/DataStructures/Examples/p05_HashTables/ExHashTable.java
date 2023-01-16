package DataStructures.Examples.p05_HashTables;

public class ExHashTable {

    public static void main(String[] args) {
        System.out.println("Exercises for HashTable");
//        testJavaHashMap();
//        testHashCodes();
        testGenericLinkedListHashTable();
//        testHashMapProblems();
//        testGenericArrayHashMap();
    }

    private static void testGenericArrayHashMap() {
        ExGenericArrayHashMap.testPut();
        ExGenericArrayHashMap.testGet();
        ExGenericArrayHashMap.testRemove();
    }

    private static void testHashMapProblems() {
        ExJavaHashTable.testMostFrequent();
        ExJavaHashTable.testOverrideHashCodeAndEquals();
        ExJavaHashTable.testCountPairsWithDiff();
        ExJavaHashTable.testTwoSum();
    }

    private static void testGenericLinkedListHashTable() {
        ExGenericLinkedListHashTable.testPut();
        ExGenericLinkedListHashTable.testGet();
        ExGenericLinkedListHashTable.testRemove();
    }

    private static void testHashCodes() {
        ExHashCodeGenerators.intHashcodeTest();
        ExHashCodeGenerators.stringHashcodeTest();
        ExHashCodeGenerators.objectHashcodeTest();
        ExProbingTest.linearProbingTest();
        ExProbingTest.quadraticProbingTest();
        ExProbingTest.doubleHashingProbingTest();
    }

    private static void testJavaHashMap() {
        ExJavaHashTable.exploreHashMap();
        ExJavaHashTable.firstNonRepeatedCharacterTest();
        ExJavaHashTable.exploreSets();
        ExJavaHashTable.firstRepeatedCharacterTest();
    }
}
