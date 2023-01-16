package DataStructures.Definitions.Linear.p05_HashTables;

public class HashCode {

    // Convention used
    // HashCode: An string(or integer) representation of an object.
    // Hash: An integer that comes from HashCode and possible is out of bounds of array.
    // IndexedHash: An integer that come from hash and is into bounds of array but possible collisions.
    // ProbingHash or Index: An integer that come from hash and is into bounds of array and with no collisions.

    public static int intHash(int number){
        return number;
    }

    public static int stringHash(String key){
        int hash=0;
        for (var ch: key.toCharArray())
            hash+=ch;
        return hash;
    }

    public static int objectHash(Object key){
        return key.hashCode();
    }

    public static int intIndexedHash(int number, int numberOfElements){
        return number%numberOfElements;
    }

    public static int stringIndexedHash(String key, int numberOfElements){
        int hash=0;
        for (var ch: key.toCharArray())
            hash+=ch;
        return intIndexedHash(hash,numberOfElements);
    }

    public static int objectIndexedHash(Object key, int numberOfElements){
        return intIndexedHash(key.hashCode(),numberOfElements);
    }

}
