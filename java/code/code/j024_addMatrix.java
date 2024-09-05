package java.code.code;

public class j024_addMatrix {
 public static void main(String[] args){
  System.out.println("Addition of two matrix");
  int[][] mat1 = {{1,2,3},{4,5,6}};
  int[][] mat2 = {{6,5,4},{3,2,1}};
  int[][] res =  {{0,0,0},{0,0,0}};
//   OR
//   int[][] res = [2][3];

  for (int i = 0; i < mat1.length; i++){
   for (int j = 0; j < mat1[i].length; j++){
    res[i][j] = mat1[i][j]+mat2[i][j];
   }
  }
  for (int i = 0; i < mat1.length; i++){
   for (int j = 0; j < mat1[i].length; j++){
    System.out.print(res[i][j] + " ");
   }
   System.out.println();
  }
 }
}

