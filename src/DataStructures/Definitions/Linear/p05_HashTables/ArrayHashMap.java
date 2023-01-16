package DataStructures.Definitions.Linear.p05_HashTables;

import DataStructures.Examples.p05_HashTables.HashMapOverflow;

import java.util.ArrayList;
import java.util.Optional;

public class ArrayHashMap<K,V> {

    private static class ArrayKeyValuePair<K,V> extends KeyValuePair<K,V> {

        public ArrayKeyValuePair(K key, V value) {
            super(key,value);
        }
    }
    private final ArrayList<Optional<KeyValuePair<K,V>>> bucketList;
    private final int numBuckets;

    public ArrayHashMap() {
        this(100);
    }
    public ArrayHashMap(int size) {
        this.bucketList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            bucketList.add(Optional.empty());
        }
        numBuckets = size;
    }

    public void put(K key, V value){
        for (int i=0;i<numBuckets;i++){
            int index = getBucketIndex(key,i);
            Optional<KeyValuePair<K,V>> bucket = bucketList.get(index);
            if (bucket.isEmpty()){
                bucketList.set(index,Optional.of(new KeyValuePair<>(key,value)));
                return;
            }
            KeyValuePair<K,V> keyValuePair=bucket.get();
            if (keyValuePair.key.equals(key)){
                keyValuePair.value=value;
                return;
            }
        }
        throw new HashMapOverflow();
    }

    public Optional<V> get(K key){
        for (int i=0;i<numBuckets;i++){
            Optional<KeyValuePair<K,V>> bucket = getBucket(key,i);
            if (bucket.isPresent()){
                KeyValuePair<K,V> keyValuePair = bucket.get();
                if (keyValuePair.key.equals(key)) {
                    return Optional.ofNullable(keyValuePair.value);
                }
            }
        }
        return Optional.empty();
    }

    public Optional<V> remove(K key){
        for (int i=0;i<numBuckets;i++){
            int index = getBucketIndex(key,i);
            Optional<KeyValuePair<K,V>> bucket = bucketList.get(index);
            if (bucket.isPresent()){
                KeyValuePair<K,V> keyValuePair = bucket.get();
                if (keyValuePair.key.equals(key)) {
                    bucketList.set(index, Optional.empty());
                    return Optional.ofNullable(keyValuePair.value);
                }
            }
        }
        return Optional.empty();
    }

    private Optional<KeyValuePair<K,V>> getBucket(K key,int i){
        int index = getBucketIndex(key,i);
        return  bucketList.get(index);
    }

    private int getBucketIndex(K key,int i){
        return Probing.linearProbing(key.hashCode(),i,numBuckets);
    }

    @Override
    public String toString() {
        return "ArrayHashMap{" +
                "bucketList=" + bucketList +
                ", numBuckets=" + numBuckets +
                '}';
    }
}
