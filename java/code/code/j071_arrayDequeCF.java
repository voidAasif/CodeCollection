package java.code.code;

import java.util.ArrayDeque;  // double ended queue;

public class j071_arrayDequeCF {
    public static void main(String[] args){
        ArrayDeque <Integer> ard = new ArrayDeque<>(); // integer type deque;

        ard.addLast(50);  // append value at last;

        ard.add(5);  // add method throw exception if value is not added in queue;
        ard.add(15);  // to access middle element we need to remove elements in queue which occurs before;
        ard.add(25);

        ard.addFirst(2);  // add value at first;

        ard.offer(55);  // offer method isn't throw exception if value is not added in queue;

        System.out.println("get first: " + ard.getFirst());
        System.out.println("remove: " + ard.remove(0));  // here 0 is value not index;
        System.out.println("get first: " + ard.getFirst());
        System.out.println("get last: " + ard.getLast());  
    }
}
