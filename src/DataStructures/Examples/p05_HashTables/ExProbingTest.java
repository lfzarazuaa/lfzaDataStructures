package DataStructures.Examples.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.HashCode;
import DataStructures.Definitions.Linear.p05_HashTables.Probing;

import java.util.Arrays;
import java.util.List;

public class ExProbingTest {

    public static void linearProbingTest(){
        System.out.println("Exercise for test Linear Probing");

        String[] itemsToCopy = new String[1000];
        String[] result = new String[1000];
        for (int i = 0; i < 1000; i++) {
            itemsToCopy[i]=Integer.toString(i+1);
        }
        fillArrayWithLinearProbing(itemsToCopy,result);
        System.out.println("Linear probing result is: " + Arrays.toString(result));
    }

    public static <T> void fillArrayWithLinearProbing(T[] items,T[] arrayToFill){
        int size=arrayToFill.length;
        int attempts=0;
        int notAdded=0;
        for (var item :items) {
            int hash = HashCode.objectHash(item);
            int i=0;
            for (i=0;i<size;i++){
                int index = Probing.linearProbing(hash,i,size);
                if (arrayToFill[index]==null){
                    attempts+=i;
                    arrayToFill[index]=item;
                    //System.out.println("The element ("+item+") was added at attempt " + i + ", with original hash="+hash%size);
                    break;
                }
            }
            if (i>=size){
                notAdded++;
                System.out.println("The element ("+item+") was not added, with original hash="+hash%size);
            }
        }
        System.out.println("There were elements " + notAdded + " not added and "+attempts+" attempts");
    }

    public static void quadraticProbingTest(){
        System.out.println("Exercise for test Quadratic Probing");

        String[] itemsToCopy = new String[1000];
        String[] result = new String[1000];
        for (int i = 0; i < 1000; i++) {
            itemsToCopy[i]=Integer.toString(i+1);
        }
        fillArrayWithQuadraticProbing(itemsToCopy,result);
        System.out.println("Quadratic probing result is: " + Arrays.toString(result));
    }

    public static <T> void fillArrayWithQuadraticProbing(T[] items,T[] arrayToFill){
        int size=arrayToFill.length;
        int maxIteration=size*2;
        int attempts=0;
        int notAdded=0;
        for (var item :items) {
            int hash = HashCode.objectHash(item);
            int i=0;
            for (i=0;i<maxIteration;i++){
                int index = i<size?
                            Probing.quadraticProbing(hash,i,size):
                            Probing.linearProbing(hash,i,size);
                if (arrayToFill[index]==null){
                    attempts+=i;
                    arrayToFill[index]=item;
                    //System.out.println("The element ("+item+") was added at attempt " + i + ", with original hash="+hash%size);
                    break;
                }
            }
            if (i>=maxIteration){
                notAdded++;
                System.out.println("The element ("+item+") was not added, with original hash="+hash%size);
            }
        }
        System.out.println("There were elements " + notAdded + " not added and "+attempts+" attempts");
    }

    public static void doubleHashingProbingTest(){
        System.out.println("Exercise for test Double Hashing Probing");

        String[] itemsToCopy = new String[1000];
        String[] result = new String[1000];
        for (int i = 0; i < 1000; i++) {
            itemsToCopy[i]=Integer.toString(i+1);
        }
        fillArrayWithDoubleHashingProbing(itemsToCopy,result);
        System.out.println("Double hashing probing result is: " + Arrays.toString(result));
    }

    public static <T> void fillArrayWithDoubleHashingProbing(T[] items,T[] arrayToFill){
        int size=arrayToFill.length;
        int maxIteration=size*2;
        int attempts=0;
        int notAdded=0;
        for (var item :items) {
            int hash = HashCode.objectHash(item);
            int i=0;
            for (i=0;i<maxIteration;i++){
                int index = i<size?
                        Probing.doubleHashingProbing(hash,991,i,size):
                        Probing.linearProbing(hash,i,size);
                if (arrayToFill[index]==null){
                    attempts+=i;
                    arrayToFill[index]=item;
                    //System.out.println("The element ("+item+") was added at attempt " + i + ", with original hash="+hash%size);
                    break;
                }
            }
            if (i>=maxIteration){
                notAdded++;
                System.out.println("The element ("+item+") was not added, with original hash="+hash%size);
            }
        }
        System.out.println("There were elements " + notAdded + " not added and "+attempts+" attempts");
    }
}
