package DataStructures.Definitions;

import DataStructures.Models.Person;

import java.util.*;

public class Utils {
    public static void binarySearchIndexTest(){
        int[] array = new int[10];
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        int res = binarySearchIndex(array,15,5);
        System.out.println(res);

//        int[] array2 = new int[10000];
//        for (int i = 0; i < array2.length-500; i++) {
//            array2[i]=i*10;
//        }
//        int res2 = binarySearchIndex(array2,55000,array2.length-500);
//        System.out.println(res2);

        int[] array3 = new int[5];
        array3[0]=10;
        array3[1]=30;
        array3[2]=50;
        int res3 = binarySearchIndex(array3,20,3);
        System.out.println(res3);
    }

    public static int binarySearchIndexDesc(int[] items,int key,int len){
        int low = 0;
        int high = len-1;
        int mid = 0;
        while (low<=high){
            mid = low + (high-low)/2;
            //System.out.println("mid="+mid+", low="+low+", high="+high);
            if (items[mid]==key){
                return mid;
            }
            else if(key<items[mid]){
                high = mid-1; // Continue lower index.
            }
            else {
                low = mid+1; // Continue higher index;
            }
        }
        //System.out.println("fmid="+mid+", low="+low+", high="+high);
        if(low>len-1 && key>items[mid])
            return low;
        if (key>items[mid])
            return mid+1;
        return mid;
    }

    public static int binarySearchIndex(int[] items,int key,int len){
        int low = 0;
        int high = len-1;
        int mid = 0;
        while (low<=high){
            mid = low + (high-low)/2;
            //System.out.println("mid="+mid+", low="+low+", high="+high);
            if (items[mid]==key){
                return mid;
            }
            else if(key>items[mid]){
                high = mid-1; // Continue lower index.
            }
            else {
                low = mid+1; // Continue higher index;
            }
        }
        //System.out.println("fmid="+mid+", low="+low+", high="+high);
        if(low>len-1 && key<items[mid])
            return low;
        if (key<items[mid])
            return mid+1;
        return mid;
    }

    public static void binarySearchIndexIComparableTest(){
        List<Person> array = new ArrayList<>();
        array.add(new Person("A",10,70));
        array.add(new Person("B",20,70));
        array.add(new Person("C",30,70));
        array.add(new Person("D",40,70));
        array.add(new Person("E",50,70));
        int res = binarySearchIndexIComparableListDesc(array,new Person("F",55,70),5);
        System.out.println(res);

        List<Person> array2 = new ArrayList<>();
        array2.add(new Person("A",10,70));
        array2.add(new Person("B",20,70));
        array2.add(new Person("C",30,70));
        int res2 = binarySearchIndexIComparableListDesc(array2,new Person("D",24,70),3);
        System.out.println(res2);

        List<Person> array3 = new ArrayList<>();
        array3.add(new Person("A",50,70));
        array3.add(new Person("B",40,70));
        array3.add(new Person("C",30,70));
        array3.add(new Person("D",20,70));
        array3.add(new Person("E",10,70));
        int res3 = binarySearchIndexIComparableListAsc(array3,new Person("F",35,70),5);
        System.out.println(res3);

        List<Person> array4 = new ArrayList<>();
        array4.add(new Person("A",30,70));
        array4.add(new Person("B",20,70));
        array4.add(new Person("C",10,70));
        int res4 = binarySearchIndexIComparableListAsc(array4,new Person("D",24,70),3);
        System.out.println(res4);
    }

    public static <T extends Comparable<? super T>> int binarySearchIndexIComparableListDesc(List<T> items,T key,int len){
        int low = 0;
        int high = len-1;
        int mid = 0;
        while (low<=high){
            mid = low + (high-low)/2;
            int compare = items.get(mid).compareTo(key);
            //System.out.println("mid="+mid+", low="+low+", high="+high+", compare="+compare);
            if (compare==0){
                return mid;
            }
            else if(compare > 0){
                high = mid-1; // Continue lower index.
            }
            else {
                low = mid+1; // Continue higher index;
            }
        }
        int compare = items.get(mid).compareTo(key);
        //System.out.println("f mid="+mid+", low="+low+", high="+high+", compare="+compare);

        if(low>len-1 && compare<0)
            return low;
        if (compare<0)
            return mid+1;
        return mid;
    }

    public static <T extends Comparable<? super T>> int binarySearchIndexIComparableListAsc(List<T> items,T key,int len){
        int low = 0;
        int high = len-1;
        int mid = 0;
        while (low<=high){
            mid = low + (high-low)/2;
            int compare = items.get(mid).compareTo(key);
            //System.out.println("mid="+mid+", low="+low+", high="+high+", compare="+compare);
            if (compare==0){
                return mid;
            }
            else if(compare < 0){
                high = mid-1; // Continue lower index.
            }
            else {
                low = mid+1; // Continue higher index;
            }
        }
        int compare = items.get(mid).compareTo(key);
        //System.out.println("f mid="+mid+", low="+low+", high="+high+", compare="+compare);

        if(low>len-1 && compare>0)
            return low;
        if (compare>0)
            return mid+1;
        return mid;
    }

    public static <T extends Comparable<? super T>> int binarySearchIndexIComparableDesc(T[] items,T key,int len){
        int low = 0;
        int high = len-1;
        int mid = 0;
        while (low<=high){
            mid = low + (high-low)/2;
            int compare = items[mid].compareTo(key);
            //System.out.println("mid="+mid+", low="+low+", high="+high+", compare="+compare);
            if (compare==0){
                return mid;
            }
            else if(compare > 0){
                high = mid-1; // Continue lower index.
            }
            else {
                low = mid+1; // Continue higher index;
            }
        }
        int compare = items[mid].compareTo(key);
        //System.out.println("f mid="+mid+", low="+low+", high="+high+", compare="+compare);

        if(low>len-1 && compare<0)
            return low;
        if (compare<0)
            return mid+1;
        return mid;
    }

    public static <T extends Comparable<? super T>> int binarySearchIndexIComparableAsc(T[] items,T key,int len){
        int low = 0;
        int high = len-1;
        int mid = 0;
        while (low<=high){
            mid = low + (high-low)/2;
            int compare = items[mid].compareTo(key);
            //System.out.println("mid="+mid+", low="+low+", high="+high+", compare="+compare);
            if (compare==0){
                return mid;
            }
            else if(compare < 0){
                high = mid-1; // Continue lower index.
            }
            else {
                low = mid+1; // Continue higher index;
            }
        }
        int compare = items[mid].compareTo(key);
        //System.out.println("f mid="+mid+", low="+low+", high="+high+", compare="+compare);

        if(low>len-1 && compare>0)
            return low;
        if (compare>0)
            return mid+1;
        return mid;
    }
}
