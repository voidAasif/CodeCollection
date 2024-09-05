package java.code.code;
// visit for more methods;
// https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

import java.util.*; // import complete collection framework;

public class j068_arrayListCF{
    public static void main(String[] args){
        System.out.println("Collection Framework");
        Scanner in = new Scanner(System.in);

        ArrayList <Integer> lst = new ArrayList<>(); // pass size on constructor to set initialCapacity of arrayList;

        System.out.println("Size of lst: " + lst.size()); // here size of arrayList is 0;

        for(int i=0; i<lst.size(); i++){ // lst.size() fun not work bcz initial size is 0 or not set;
            System.out.print("Enter the element: ");
            int a = in.nextInt();
            lst.add(a);
        }

        lst.add(1000);  // append 1000 in arrayList;
        lst.add(0, 5000); // add 5000 at index 0 and move index 0 element at index 1;
        lst.add(0, 6000); // add 6000 at index 0 and move index 0 element at index 1;

        lst.clear();  // clear entire ArrayList;

        for(int i=0; i<lst.size(); i++){  // print arrayList;
            System.out.print("Ele-" + i + ": ");
            System.out.println(lst.get(i));
        }

        System.out.println("print loop end");

        System.out.println(lst.get(0)); // get value at index 0;
        System.out.println(lst.get(5)); // get value at index 5;
        System.out.println(lst.get(lst.size()-1)); // print last element of arrayList;

        System.out.println(lst.contains(1000)); // return true if arrayList contains 1000;
        System.out.println(lst.indexOf(1000));  // print index of arraylist wher first 1000 stores;
        System.out.println(lst.lastIndexOf(1000)); // print indes of arrayList where last 1000 stores;

        in.close();
    }
}