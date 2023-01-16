package DataStructures.Definitions.Linear.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.Interfaces.IKeyValuePair;

public class KeyValuePair<K,V> implements IKeyValuePair<K,V> {
    protected final K key;

    protected V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public String toString() {
        return "{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
