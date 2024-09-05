package java.code.code;

import java.util.*;

public class j069_addArrayListCF {
    public static void main(String[] args){
        System.out.println("Add two charcater arrayList");

        ArrayList <Character> chList1 = new ArrayList<>();
        ArrayList <Character> chList2 = new ArrayList<>();

        chList1.add('a');
        chList1.add('b');
        chList1.add('c');
        chList1.add('d');
        chList1.add('e');

        System.out.println("List 1");
        for(int i=0; i<chList1.size(); i++){
            System.out.println(chList1.get(i));
        }

        chList2.add('A');
        chList2.add('B');
        chList2.add('C');
        chList2.add('D');
        chList2.add('E');

        System.out.println("List 2");
        for(int i=0; i<chList2.size(); i++){
            System.out.println(chList2.get(i));
        }

        chList1.addAll(chList2);

        System.out.println("Merge: ");

        for(int i=0; i<chList1.size(); i++){
            System.out.println(chList1.get(i));
        }
    }
}
