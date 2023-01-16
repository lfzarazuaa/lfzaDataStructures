package DataStructures.Definitions.Linear.p05_HashTables;

public class Probing {

    // Convention used
    // HashCode: An string(or integer) representation of an object.
    // Hash: An integer that comes from HashCode and possible is out of bounds of array.
    // IndexedHash: An integer that come from hash and is into bounds of array but possible collisions.
    // ProbingHash or Index: An integer that come from hash and is into bounds of array and with no collisions.

    public static int linearProbing(int hash,int i,int numberOfElements){
        return (hash+i)%numberOfElements;
    }

    public static int quadraticProbing(int hash,int i,int numberOfElements){
        return (hash+i*i)%numberOfElements;
    }

    public static int doubleHashingProbing(int hash,int prime,int i,int numberOfElements){
        if (i==0)
            return (doubleHashingHash1(hash,numberOfElements))%numberOfElements;
        return (doubleHashingHash1(hash,numberOfElements)+i*doubleHashingHash2(hash,prime))%numberOfElements;
    }

    public static int doubleHashing(int hash1,int hash2,int i,int numberOfElements){
        return (hash1+i*hash2)%numberOfElements;
    }

    public static int doubleHashingHash1(int hash,int numberOfElements){
        return hash%numberOfElements;
    }

    public static int doubleHashingHash2(int hash,int prime){
        return prime-(hash%prime);
    }

}
