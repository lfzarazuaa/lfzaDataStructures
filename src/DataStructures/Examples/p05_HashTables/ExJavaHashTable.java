package DataStructures.Examples.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.Pair;

import java.util.*;

public class ExJavaHashTable {
    public static void exploreHashMap(){
        System.out.println("Exercise for explore HashMap");
        Map<Integer, String> map = new HashMap<>();
        map.put(0,"Luis");
        map.put(1,"John");
        map.put(2,"Erick");
        map.put(3,"Gale");
        // Override a value.
        map.put(3,"Sam");
        // Create a null value
        map.put(4,null);
        // Create a null key
        map.put(null,null);
        System.out.println(map);

        System.out.println("Contains key O(1) for 3="+map.containsKey(3));
        System.out.println("Contains value O(n) for Sam="+map.containsValue("Sam"));

        map.get(5);
        // Iterate over a map with values
        ArrayList<String> values = new ArrayList<>();
        for (var item : map.values()) {
            values.add(item);
        }
        System.out.println("Iterating over values="+Arrays.toString(values.toArray()));

        // Iterate over a map with keys
        ArrayList<Integer> keys = new ArrayList<>();
        for (var item : map.keySet()) {
            keys.add(item);
        }
        System.out.println("Iterating over keys="+Arrays.toString(keys.toArray()));

        // Iterate over a map with key value pair
        ArrayList<Map.Entry<Integer,String>> keyValuePair = new ArrayList<>();
        for (var item : map.entrySet()) {
            keyValuePair.add(item);
        }
        System.out.println("Iterating over keyValuePair="+Arrays.toString(keyValuePair.toArray()));
    }

    public static void firstNonRepeatedCharacterTest(){
        System.out.println("Exercise for finding first non repeated Character");
        System.out.println("Find first non repeated char for (Hello WorldH):"+firstNonRepeatedCharacter("Hello WorldH"));
        System.out.println("Find first non repeated char for (a green apple):"+firstNonRepeatedCharacter("a green apple"));
        System.out.println("Find first non repeated char for (abbaabbaabbbaa):"+firstNonRepeatedCharacter("abbaabbaabbbaa"));

        System.out.println("Find first non repeated char for (Hello WorldH):"+firstNonRepeatedCharacter2ndMethod("Hello WorldH"));
        System.out.println("Find first non repeated char for (a green apple):"+firstNonRepeatedCharacter2ndMethod("a green apple"));
        System.out.println("Find first non repeated char for (abbaabbaabbbaa):"+firstNonRepeatedCharacter2ndMethod("abbaabbaabbbaa"));
    }

    public static String firstNonRepeatedCharacter(String str){
        Map<Character,Integer> charMap = new HashMap<>();

        char[] chars= str.toCharArray();
        for (var chr : chars) {
            if (charMap.containsKey(chr))
                charMap.put(chr,charMap.get(chr)+1);
            else
                charMap.put(chr,1);
        }

        System.out.println(charMap);

        for (var chr : chars) {
            if (charMap.get(chr)==1) {
                return Character.toString(chr);
            }
        }

        return null;
    }

    public static String firstNonRepeatedCharacter2ndMethod(String str){
        Map<Character,Integer> charMap = new HashMap<>();

        char[] chars= str.toCharArray();
        for (var chr : chars) {
            var count = charMap.getOrDefault(chr, 0);
            charMap.put(chr, count+1);
        }

        System.out.println(charMap);

        for (var chr : chars) {
            if (charMap.get(chr)==1) {
                return Character.toString(chr);
            }
        }

        return null;
    }

    public static void exploreSets(){
        System.out.println("Exercise for explore Sets");
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1,2,3,3,2,1,1,4,8,8,9};
        for (var num : numbers) {
            set.add(num);
        }
        System.out.println("Original Values"+ Arrays.toString(numbers));
        System.out.println("Set Values"+ set);
    }

    public static void firstRepeatedCharacterTest(){
        System.out.println("Exercise for finding first repeated Character");
        System.out.println("Find first repeated char for (Hello WorldH):"+firstRepeatedCharacter("Hello WorldH"));
        System.out.println("Find first repeated char for (a green apple):"+firstRepeatedCharacter("a green apple"));
        System.out.println("Find first repeated char for (abbaabbaabbbaa):"+firstRepeatedCharacter("abbaabbaabbbaa"));
    }

    public static String firstRepeatedCharacter(String str){
        Set<Character> charSet = new HashSet<>();

        for (var chr : str.toCharArray()) {
            if (charSet.contains(chr))
                return Character.toString(chr);
            charSet.add(chr);
            System.out.println(charSet);
        }

        return null;
    }

    public static void testMostFrequent(){
        System.out.println("Exercise test the Most Frequent Element");

        Collection<Integer> integers = Arrays.asList(1,2,2,3,3,3,4);
        int value = mostFrequentElement(integers);
        System.out.println("The most repeated element in array "+integers+"\n is "+value);

        String sentence = "This is a sentence to test the most repeated values, is a good exercise.";
        Collection<String> wordList = new ArrayList<>();
        Collections.addAll(wordList, sentence.split(" "));

        String word = mostFrequentElement(wordList);
        System.out.println("The most repeated element in sentence \""+ sentence+"\"\n is "+word);
    }

    public static <T> T mostFrequentElement(Collection<T> items){
        Map<T,Integer> hashTableFrequency = new HashMap<>();

        for (var item : items) {
            int count = hashTableFrequency.getOrDefault(item,0);
            hashTableFrequency.put(item,count+1);
        }
        int max = -1; // Default value.
        T key = null;
        for (var entry : hashTableFrequency.entrySet()) {
            if (entry.getValue()>max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }

    public static void testOverrideHashCodeAndEquals(){
        System.out.println("Exercise for Override Hashcode and Equals");

        Pair pair1 = new Pair(1,3);
        Pair pair2 = new Pair(1,3);

        System.out.println("Pair1"+pair1+" equals Pair2"+pair2 +"=" + pair1.equals(pair2));
        System.out.println("Pair1"+pair1+" hashcode equals Pair2"+pair2 +"=" +(pair1.hashCode()==pair2.hashCode()));

        Map<Pair,String> testHash = new HashMap<>();

        testHash.put(pair1,"Pair 1");
        System.out.println("Adding Pair1="+testHash);
        System.out.println("Contains Pair2="+testHash.containsKey(pair2));
        testHash.put(pair2,"Pair 2");
        System.out.println("Adding Pair2="+testHash);
    }
    public static void testCountPairsWithDiff(){
        System.out.println("Exercise for Count the number of Unique Pairs that have difference k");

        List<Integer> integers = Arrays.asList(1,7,5,9,2,12,3);
        Collection<Pair> uniquePairsA = countPairsWithDiff(integers,2);
        Collection<Pair> uniquePairsB = countPairsWithDiffB(integers,2);
        System.out.println("The unique pairs in list "+integers+"\n is "+uniquePairsA);
        System.out.println("The unique pairs in list "+integers+"\n is "+uniquePairsB);
        System.out.println("The count of unique pairs in list "+integers+"\n is "+countPairsWithDiffC(integers,2));
    }



    public static Collection<Pair> countPairsWithDiff(List<Integer> items, int k){
        Set<Integer> set = new HashSet<>(items);

        Set<Pair> uniquePairs = new HashSet<>();
        for (int i = 0; i < items.size()-1; i++) {
            int n1=items.get(i);
            int target1=n1+k;
            int target2=n1-k;
            if (set.contains(target1))
                uniquePairs.add(new Pair(n1,target1));
            if (set.contains(target2))
                uniquePairs.add(new Pair(n1,target1));
//            for (int j = i+1; j < items.size(); j++) {
//                int n2=items.get(j);
//                if (Math.abs(n1-n2)==k){
//                    uniquePairs.add(new Pair(n1,n2));
//                }
//            }
        }
        return new ArrayList<>(uniquePairs);
    }

    public static Collection<Pair> countPairsWithDiffB(List<Integer> items, int k){
        Set<Integer> sortedSet = new TreeSet<>(items);
        List<Integer> orderedNumbers = new ArrayList<>(sortedSet);
        List<Pair> uniquePairs = new ArrayList<>();
        for (int i = 0; i < orderedNumbers.size()-1; i++) {
            int n1=items.get(i);
            for (int j = i+1; j < items.size(); j++) {
                int n2=items.get(j);
                if (Math.abs(n1-n2)==k){
                    uniquePairs.add(new Pair(n1,n2));
                }
            }
        }
        return uniquePairs;
    }

    public static int countPairsWithDiffC(List<Integer> numbers, int difference) {
        Set<Integer> set = new HashSet<>(numbers);

        var count = 0;
        for (var number : numbers) {
            if (set.contains(number + difference))
                count++;
            if (set.contains(number - difference))
                count++;
            set.remove(number);
        }

        return count;
    }

    public static void testTwoSum(){
        System.out.println("Exercise for get first time A + B = Target on a list");

        List<Integer> integers = Arrays.asList(2,7,11,15);
        Collection<Integer> indexesA = twoSum(integers,9);
        Collection<Integer> indexesB = twoSum(integers,22);
        System.out.println("The indexes in list "+integers+"\n that sum 9 are "+indexesA);
        System.out.println("The indexes in list "+integers+"\n that sum 22 are "+indexesB);

        List<Integer> integers2 = new ArrayList<>(integers);
        for (int i = 0; i < 10_000; i++) {
            integers2.add(1);
        }
        Collection<Integer> indexesC = twoSum(integers2,9);
        Collection<Integer> indexesD = twoSum(integers2,22);
        Collection<Integer> indexesE = twoSum(integers2,16);
        System.out.println("The indexes in list "+integers2+"\n that sum 9 are "+indexesC);
        System.out.println("The indexes in list "+integers2+"\n that sum 22 are "+indexesD);
        System.out.println("The indexes in list "+integers2+"\n that sum 16 are "+indexesE);
    }

    public static List<Integer> twoSum(List<Integer> numbers, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        // a + x = target
        // x = a - target
        for (int i = 0; i < numbers.size(); i++) {
            int x = target - numbers.get(i);
            if (map.containsKey(x)) {
                return Arrays.asList(map.get(x), i);
            }
            map.put(numbers.get(i), i);
        }

        // Time complexity of this method is O(n) because we need to iterate
        // the array only once.

        return new ArrayList<>();
    }
}
