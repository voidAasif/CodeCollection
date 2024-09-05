package code;

import java.util.LinkedList;

public class j070_linkedListCF {
    public static void main(String[] args){
        LinkedList <Character> chList1 = new LinkedList<>();
        LinkedList <Character> chList2 = new LinkedList<>();

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

        chList1.addAll(chList2); //append chList2 in chList1;

        //below two methods are not present in ArrayList;
        chList1.addLast('Z');  //add 'Z' at last node of linkedList;
        chList1.addFirst('X'); //add 'X' at first node of linkedList;

        System.out.println("Merge: ");

        for(int i=0; i<chList1.size(); i++){
            System.out.println(chList1.get(i));
        }

    }
}
