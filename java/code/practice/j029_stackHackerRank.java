package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

//HackerRank;
// A string containing only parentheses is balanced if the following is true: 
//1. if it is an empty string 
//2. if A and B are correct, AB is correct, 
//3. if A is correct, (A) and {A} and [A] are also correct.


// Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
// Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
// Given a string, determine if it is balanced or not.

// Input Format
// There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.
// The part of the code that handles input operation is already provided in the editor.
// Output Format
// For each case, print 'true' if the string is balanced, 'false' otherwise.

// Sample Input
// {}()
// ({()})
// {}(
// []

// Sample Output
// true
// true
// false
// true


class CheckBalance{
    
    private final String filePath = "practice/res/j029.txt";
    private String currentLine;
    boolean result;
    private Stack<Character> stack = new Stack<>();

    public void readFile() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        while ((currentLine = br.readLine()) != null) {
            result = isBalanced(currentLine);
        }
        br.close();
    }

    private boolean isBalanced(String currentLine){

        for(int i=0; i<currentLine.length(); i++){
            if(currentLine.charAt(i) == '{' ||
                currentLine.charAt(i) == '[' ||
                currentLine.charAt(i) == '('){

                    stack.push(currentLine.charAt(i));
                    System.out.println("push: "+currentLine.charAt(i));
            }
            else {
                if(!stack.isEmpty()){
                    System.out.println("peek: "+stack.peek());
                    stack.pop();
                }
            }
            
        }

        if(stack.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}



public class j029_stackHackerRank {
    public static void main(String[] args) throws Exception{
        CheckBalance obj = new CheckBalance();
        obj.readFile();
        System.out.println(obj.result);
    }
}

// problem: [) gives true;