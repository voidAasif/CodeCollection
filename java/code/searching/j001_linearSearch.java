package searching;

import java.util.Scanner;


class ls{
    int [] arr = new int[5];
    int find;
    int flag = 0;

    public void setArr(){
        Scanner in = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            System.out.printf("Enter element %d: ",i);
            arr[i] = in.nextInt();
        }
        in.close();
    }
    public void setFind(int find){
        this.find = find;
    }
    public void search(){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == find){
                System.out.println("Element found at index: " + i);
                flag = -1;
                break;
            }
        }
        if(flag != -1){
            System.out.println("Not found");
        }
    }
}

public class j001_linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ls obj = new ls();

        obj.setArr();
        System.out.print("Find: ");
        obj.setFind(in.nextInt());

        obj.search();
        in.close();
    }
}
