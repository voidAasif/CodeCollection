package code;

import java.util.HashSet; //use key value to store and search elements;

public class j072_hashSetCF {
    public static void main(String[] args){
        //In the context of a HashSet in Java.
        //The loadFactor is a measure that determines how full the hash table can get before it needs to resize (rehash). 
        HashSet <Integer> hashLst = new HashSet<>(10, 0.5f); // (int initialCapacity, float loadFactor);
        
        hashLst.add(10);
        hashLst.add(20);
        hashLst.add(50);
        hashLst.add(20);
        hashLst.add(30); 
        
        System.out.print("Hash Set: " + hashLst);
    }
}
