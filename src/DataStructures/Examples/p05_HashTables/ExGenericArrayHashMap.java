package DataStructures.Examples.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.ArrayHashMap;
import DataStructures.Definitions.Linear.p05_HashTables.Interfaces.IKeyValuePair;
import DataStructures.Definitions.Linear.p05_HashTables.KeyValuePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExGenericArrayHashMap {
    public static void testPut(){
        System.out.println("Exercise for test Put in GenericArrayHashTable");

        ArrayHashMap<String,String> hashMap = new ArrayHashMap<>(50);
        System.out.println("Hashmap: "+hashMap);
        // For adding elements
        for (int i = 0; i < 50; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$I"+Math.abs(key.hashCode());
            hashMap.put(key,value);
        }
        System.out.println("When adding 50 keys: "+hashMap);
        // For updating keys
        for (int i = 0; i < 49; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$U"+Math.abs(key.hashCode());
            hashMap.put(key,value);
        }
        System.out.println("When updating 49 keys: "+hashMap);
        int i = 51;
        String key=Integer.toString(i+1);
        String value=key+"$I"+Math.abs(key.hashCode());
        try {
            hashMap.put(key,value);
        }
        catch (HashMapOverflow ex) {
            System.out.println("An overflow has occurred, cannot add more elements.");
        }

    }

    public static void testGet(){
        System.out.println("Exercise for test Get in GenericArrayHashTable");

        ArrayHashMap<String,String> hashMap = new ArrayHashMap<>(50);

        // Adding elements

        for (int i = 0; i < 45; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$I"+Math.abs(key.hashCode());
            hashMap.put(key,value);
        }
        System.out.println("When adding 100 keys: "+hashMap);

        // Getting keys
        for (int i = 40; i < 50; i++) {
                String key=Integer.toString(i+1);
                Optional<String> value=hashMap.get(key);
                if (value.isPresent())
                    System.out.println("When key = " + key + ", value is " + value.get());
                else
                    System.out.println("Key " + key + " not added yet.");
        }
    }

    public static void testRemove(){
        System.out.println("Exercise for test Get in GenericArrayHashTable");

        ArrayHashMap<String,String> hashMap = new ArrayHashMap<>(50);

        // Adding elements

        for (int i = 0; i < 50; i++) {
            String key=Integer.toString(i+1);
            String value=key+"$I"+Math.abs(key.hashCode());
            hashMap.put(key,value);
        }
        System.out.println("When adding 100 keys: "+hashMap);

        List<IKeyValuePair<String,String>> removedItems= new ArrayList<>();

        // Removing elements
        for (int i = 40; i < 60; i++) {
            String key=Integer.toString(i+1);
            Optional<String> removed=hashMap.remove(key);
            if (removed.isPresent()) {
                System.out.println("When key = " + key + " is removed, the value is " + removed.get());
                removedItems.add(new KeyValuePair<>(key, removed.get()));
            }
            else
                System.out.println("Cannot remove Key " + key + " .");

        }

        System.out.println("When removing 20 keys: " + hashMap);
        System.out.println("Removed Items="+removedItems);

    }
}
