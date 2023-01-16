package DataStructures.Examples.p05_HashTables;

import DataStructures.Definitions.Linear.p05_HashTables.HashCode;

public class ExHashCodeGenerators {

    public static void intHashcodeTest(){
        System.out.println("Exercise for test int Hashcode");
        int[] values={51,22,77,45,18,69,83};
        int size = values.length;
        for (var value:values){
            System.out.println("Array of size="+values.length
                    +", value="+value
                    + ", hashcode="+ HashCode.intIndexedHash(value,size));
        }
    }

    public static void stringHashcodeTest(){
        System.out.println("Exercise for test string Hashcode");
        String[] values={"51","22","77","45","18","69","83"};
        int size = values.length;
        for (var value:values){
            System.out.println("Array of size="+values.length
                    +", value="+value
                    + ", hashcode="+ HashCode.stringIndexedHash(value,size));
        }
    }

    public static void objectHashcodeTest(){
        System.out.println("Exercise for test object Hashcode");
        String[] values={"51","22","77","45","18","69","83"};
        int size = values.length;
        for (var value:values){
            System.out.println("Array of size="+values.length
                    +", value="+value
                    + ", hashcode="+ HashCode.objectIndexedHash(value,size));
        }
    }
}
