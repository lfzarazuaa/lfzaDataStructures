package DataStructures.Definitions.Linear.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.Interfaces.IKeyValuePair;

import java.util.ArrayList;
import java.util.Collection;
import  java.util.LinkedList;


public class LinkedListHashTable<K,V> {
    public static class LinkedListKeyValuePair<K,V> extends KeyValuePair<K,V> {

        public LinkedListKeyValuePair(K key, V value) {
            super(key,value);
        }
    }

    private final ArrayList<LinkedList<LinkedListKeyValuePair<K,V>>> bucketList;
    private final int numBuckets;

    public LinkedListHashTable() {
        this(20);
    }
    public LinkedListHashTable(int size) {
        this.bucketList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            this.bucketList.add(new LinkedList<>());
        }
        numBuckets = size;
    }

    public LinkedListHashTable(int size, Collection<IKeyValuePair<K,V>> entries) {
        this(size);
        for (var entry :entries) {
            put(entry.getKey(),entry.getValue());
        }
    }

    public void put(K key, V value){
        // Generate index from hashcode.
        int index = getBucketIndex(key);

        // Find bucket on Array.
        LinkedList<LinkedListKeyValuePair<K,V>> bucket = bucketList.get(index);

        for (var keyValuePair: bucket) {
            // Update keyValuePair
            if (keyValuePair.key.equals(key)){
                keyValuePair.value=value;
                return;
            }
        }

        // Add new keyValuePair
        bucket.addLast(new LinkedListKeyValuePair<>(key, value));
    }

    public V get(K key){

        // Generate index from hashcode.
        int index = getBucketIndex(key);

        // Find bucket on Array.
        LinkedList<LinkedListKeyValuePair<K,V>> bucket = bucketList.get(index);

        for (var keyValuePair: bucket) {
            // Find element.
            if (keyValuePair.key.equals(key))
                return keyValuePair.value;
        }

        return null;
    }

    public V remove(K key){
        // Generate index from hashcode.
        int index = getBucketIndex(key);

        // Find bucket on Array.
        LinkedList<LinkedListKeyValuePair<K,V>> bucket = bucketList.get(index);

        for (var keyValuePair: bucket) {
            // Find element.
            if (keyValuePair.key.equals(key)) {
                bucket.remove(keyValuePair);
                return keyValuePair.value;
            }
        }
        return null;
    }

    private int getBucketIndex(K key){
        return key.hashCode()% numBuckets;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("HashTable{");
        int i=0;
        for (var linkedList : bucketList) {
            result.append("\n\titems[")
                    .append(i)
                    .append("]=")
                    .append(linkedList)
                    .append(",");
            i++;
        }
        result.append("\n}");
        return result.toString();
    }
}
