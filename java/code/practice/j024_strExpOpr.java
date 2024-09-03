package practice;

import java.util.Scanner;

public class j024_strExpOpr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // char a = '+', s = '-', m = 'x', d = '/';

        // System.out.println((int)a); //43
        // System.out.println((int)s); //45
        // System.out.println((int)m); //120
        // System.out.println((int)d); //47

        // input;
        System.out.println("Enter expression: 31+345/21x4$"); // eg.. 31 + 345 - 4 x 5 / 7;
        // String str = in.next();
        // String str = "31+345/21x4$";
        // String str = "31-50x6/6$";
        String str = "9/6x8+45$";

        // char[] opr = new char[10];

        String[] valueArr = new String[10]; // store 

        String value = "";

        int count = 0;
        int charCount = -1; //count number of operator in expression;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == 'x' || str.charAt(i) == '/'
                    || str.charAt(i) == '$') {

                valueArr[count++] = value;
                // opr[i] = str.charAt(i);
                value = ""; // reset;

                valueArr[count++] = ""+str.charAt(i); // char can't convert into string; store as a char;

                charCount++;

            } else {
                value = value + str.charAt(i);
            }
        }
        System.out.println("CharCount: " + charCount);

        // replace null with '$';
        for (int i = 0; i < valueArr.length; i++) {
            if (valueArr[i] == null) {
                valueArr[i] = "$";
            }
        }
        
        // print;
        for (int i = 0; i < valueArr.length; i++) {
            System.out.println("store value Arr: " + valueArr[i]);
        }

        // System.out.println("jflask: "+ (valueArr[3].equals('/')));
        
        // for(int i=0; i<valueArr.length; i++){
            //     if(valueArr[i] == "$"){
                //         break;
                //     }
                
                //     if(i == 0 || i%1 == 0){
                    //         valueArr[i] =  valueArr[i+1];
                    //     }
                    // }
                    


                    // here; // 31+345/21x4$
                    double result = 0.0d;
                    for(int i=0; i<valueArr.length; i++){
                        if(valueArr[i].equals("/")){
                            
                            result = Double.parseDouble(valueArr[i-1]) / Double.parseDouble(valueArr[i+1]);
                            valueArr[i-1] = String.valueOf(result);

                            valueArr[i] = "$";
                            valueArr[i+1] = "$";

                            for(int j=0; j<valueArr.length; j++){
                                for(int k=j; k<valueArr.length; k++){
                                    if(valueArr[j] == "$"){
                                        if(valueArr[k] != "$"){
                                            valueArr[j] = valueArr[k];
                                            valueArr[k] = "$";
                                        }
                                    }
                                }
                            }

                        }
                    }

                    for(int i=0; i<valueArr.length; i++){
                        if(valueArr[i].equals("x")){
                            
                            result = Double.parseDouble(valueArr[i-1]) * Double.parseDouble(valueArr[i+1]);
                            valueArr[i-1] = String.valueOf(result);

                            valueArr[i] = "$";
                            valueArr[i+1] = "$";

                            for(int j=0; j<valueArr.length; j++){
                                for(int k=j; k<valueArr.length; k++){
                                    if(valueArr[j] == "$"){
                                        if(valueArr[k] != "$"){
                                            valueArr[j] = valueArr[k];
                                            valueArr[k] = "$";
                                        }
                                    }
                                }
                            }

                        }
                    }

                    for(int i=0; i<valueArr.length; i++){
                        if(valueArr[i].equals("+")){
                            
                            result = Double.parseDouble(valueArr[i-1]) + Double.parseDouble(valueArr[i+1]);
                            valueArr[i-1] = String.valueOf(result);

                            valueArr[i] = "$";
                            valueArr[i+1] = "$";

                            for(int j=0; j<valueArr.length; j++){
                                for(int k=j; k<valueArr.length; k++){
                                    if(valueArr[j] == "$"){
                                        if(valueArr[k] != "$"){
                                            valueArr[j] = valueArr[k];
                                            valueArr[k] = "$";
                                        }
                                    }
                                }
                            }

                        }
                    }

                    for(int i=0; i<valueArr.length; i++){
                        if(valueArr[i].equals("-")){
                            
                            result = Double.parseDouble(valueArr[i-1]) - Double.parseDouble(valueArr[i+1]);
                            valueArr[i-1] = String.valueOf(result);

                            valueArr[i] = "$";
                            valueArr[i+1] = "$";

                            for(int j=0; j<valueArr.length; j++){
                                for(int k=j; k<valueArr.length; k++){
                                    if(valueArr[j] == "$"){
                                        if(valueArr[k] != "$"){
                                            valueArr[j] = valueArr[k];
                                            valueArr[k] = "$";
                                        }
                                    }
                                }
                            }

                        }
                    }
                    
                    
                    
                    
                    // print;
                    for (int i = 0; i < valueArr.length; i++) {
                        System.out.println("claculate value Arr: " + valueArr[i]);
                    }
                    
                    
                    
                    System.out.println("Ans: " + result);
                    
                    in.close();
    }
}

// fill null index;
// for(int i=0; i<valueArr.length; i++){
//     for(int j=i; j<valueArr.length; j++){
//         if(valueArr[i] == "$"){
//             if(valueArr[j] != "$"){
//                 valueArr[i] = valueArr[j];
//             }
//         }
//     }
// }