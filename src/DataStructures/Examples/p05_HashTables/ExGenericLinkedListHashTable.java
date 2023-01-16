package DataStructures.Examples.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.KeyValuePair;
import DataStructures.Definitions.Linear.p05_HashTables.LinkedListHashTable;

import java.util.ArrayList;
import java.util.List;

public class ExGenericLinkedListHashTable {

    public static void testPut(){
        System.out.println("Exercise for test Put in GenericLinkedListHashTable");

        LinkedListHashTable<String,String> hashTable= new LinkedListHashTable<>(25);

        // For adding elements
        for (int i = 0; i < 100; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$I"+Math.abs(key.hashCode());
            hashTable.put(key,value);
        }
        System.out.println("When adding 100 keys: "+hashTable);
        // For updating keys
        for (int i = 0; i < 50; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$U"+Math.abs(key.hashCode());
            hashTable.put(key,value);
        }

        System.out.println("When updating 50 keys: "+hashTable);

    }

    public static void testGet(){
        System.out.println("Exercise for test Get in GenericLinkedListHashTable");

        LinkedListHashTable<String,String> hashTable= new LinkedListHashTable<>();

        // Adding elements

        for (int i = 0; i < 100; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$I"+Math.abs(key.hashCode());
            hashTable.put(key,value);
        }
        System.out.println("When adding 100 keys: "+hashTable);

        List<KeyValuePair<String,String>> gottenItems= new ArrayList<>();
        List<String> notExistingKeys= new ArrayList<>();

        // Getting elements
        for (int i = 75; i < 125; i++) {
            String key=Integer.toString(i+1);
            String value = hashTable.remove(key);
            if (value==null)
                notExistingKeys.add(key);
            else
                gottenItems.add(new KeyValuePair<>(key, value));
        }

        System.out.println("When getting 50 keys: "+hashTable);
        System.out.println("Getting Items="+gottenItems);
        System.out.println("Not Existing keys="+notExistingKeys);
    }

    public static void testRemove(){
        System.out.println("Exercise for test Get in GenericLinkedListHashTable");

        LinkedListHashTable<String,String> hashTable= new LinkedListHashTable<>();

        // Adding elements
        for (int i = 0; i < 100; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$I"+Math.abs(key.hashCode());
            hashTable.put(key,value);
        }
        System.out.println("When adding 100 keys: "+hashTable);

        List<KeyValuePair<String,String>> removedItems= new ArrayList<>();
        List<String> notExistingKeys= new ArrayList<>();

        // Removing elements
        for (int i = 75; i < 125; i++) {
            String key=Integer.toString(i+1);
            String value = hashTable.remove(key);
            if (value==null)
                notExistingKeys.add(key);
            else
                removedItems.add(new KeyValuePair<>(key, value));
        }

        System.out.println("When removing 50 keys: "+hashTable);
        System.out.println("Removed Items="+removedItems);
        System.out.println("Not Existing keys="+notExistingKeys);
    }
}
