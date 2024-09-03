package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class j025_strExpOpr2 {

    private static void evaluate(List<String> valueList, String operator) { //evaluate method;
        for (int i = 0; i < valueList.size(); i++) {
            if (valueList.get(i).equals(operator)) {
                double operand1 = Double.parseDouble(valueList.get(i - 1));
                double operand2 = Double.parseDouble(valueList.get(i + 1));
                double result = 0.0;

                switch (operator) {
                    case "/":
                        result = operand1 / operand2;
                        break;
                    case "x":
                        result = operand1 * operand2;
                        break;
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                }

                // Replace the operator and its operands with the result
                valueList.set(i - 1, String.valueOf(result));
                valueList.remove(i);  // Remove operator
                valueList.remove(i);  // Remove second operand
                i--;  // Adjust index after removal
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter expression (end with $): ");
        String str = in.next();  // Example: "31-50x6/6$"
        
        List<String> valueList = new ArrayList<>();
        String value = "";

        // Parsing the input string into operands and operators
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '+' || ch == '-' || ch == 'x' || ch == '/' || ch == '$') {
                valueList.add(value);
                valueList.add(String.valueOf(ch));
                value = "";  // Reset the value string
            } else {
                value += ch;
            }
        }

        // Function to evaluate an expression with a given operator
        evaluate(valueList, "/");
        evaluate(valueList, "x");
        evaluate(valueList, "+");
        evaluate(valueList, "-");

        System.out.println("Ans: " + valueList.get(0)); //ans;

        in.close();
    }
}
