package practice;
// Write a java program to print an array after changing the rows and columns of a two-dimensional array.
// Original array: 
// 10 20 30
// 40 50 60

// After changing the row and columns of the said array: 
// 10 40
// 20 50
// 30 60

public class j021_rowColumnArray {
    public static void main(String[] args){
        // define original array;
        int[][] arrOriginal = {{10, 20, 30},{40, 50, 60}};

        // print original array;
        System.out.println("Original Array:");
        for(int i=0; i<arrOriginal.length; i++){
            for(int j=0; j<arrOriginal[i].length; j++){   //length of first array;
                System.out.print(arrOriginal[i][j] + " ");
            }
            System.out.println();
        }

        // swap rows with columns;
        System.out.println("After changing rows and columns: ");
        for(int i=0; i<arrOriginal[0].length; i++){  //length of first array;
            for(int j=0; j<arrOriginal.length; j++){
                System.out.print(arrOriginal[j][i] + " ");  //change rows with columns;
            }
            System.out.println();
        }
    }
}
