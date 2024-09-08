package javaHub.FrameSwing.project;

// import FrameSwing.project.Process;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane; //imports;
import javax.swing.border.Border;

class Process { // class to perform different operation on string;
    private String expression;
    String sResult = "Result"; // store result (string);
    boolean testFlag = true; // to check all the test are passed;

    Process(String str) { // constructor;
        this.expression = str; // set value of str into expression;
        System.out.println("exp: " + expression); // log;

        // test 1; check expression must not start with mul or div and not end with any
        // other operator;
        if (expression.charAt(0) == 'x' || expression.charAt(0) == '/'
                || expression.charAt(expression.length() - 2) == '/'
                || expression.charAt(expression.length() - 2) == 'x'
                || expression.charAt(expression.length() - 2) == '+'
                || expression.charAt(expression.length() - 2) == '-') {
            sResult = "Error";
            testFlag = false;
            System.out.println("extra operator occurred");
        }

        // test 2; check expression must not contains two or more distinct operator;
        for (int i = 0; i < expression.length() - 1; i++) { // length - 1 because last char is "$";

            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == 'x'
                    || expression.charAt(i) == '/') {
                if (expression.charAt(i) == expression.charAt(i + 1)) {
                    sResult = "Error";
                    testFlag = false;
                    System.out.println("expression contains distinct operator");
                }
            }
        }

        // run if upper two test are clear;
        if (testFlag) {

            // dynamic method dispatch; A list of type ArrayList; ArrayList<String> obj =
            // new ArrayList<>() also worked;
            List<String> valueList = new ArrayList<>(); // array list to store expression character at individual index;
            String value = "";

            // Parsing the input string into operands and operators
            // iterate expression string, if char(operator) not occur then append
            // char(operator) into value, and when char(operator) occur add value into
            // valueList and add occurred char(operator) on next index of valueList;
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);
                if (ch == '+' || ch == '-' || ch == 'x' || ch == '/' || ch == '$') {
                    valueList.add(value);
                    valueList.add(String.valueOf(ch)); // type cast char into string;
                    value = ""; // Reset the value string
                } else {
                    value += ch; // append character into value(here ch != any operator);
                }
            }

            // Function to evaluate an expression with a given operator
            evaluate(valueList, "/"); // bo D mas; //call;
            evaluate(valueList, "x"); // bod M as; //call;
            evaluate(valueList, "+"); // bodm A s; //call;
            evaluate(valueList, "-"); // bodma S ; //call;

            sResult = valueList.get(0); // at the end result stored at 0th index;
            System.out.println("Ans: " + sResult); // log;
        }

    }

    private static void evaluate(List<String> valueList, String operator) { // evaluate method (receive ArrayList and
                                                                            // operator);
        for (int i = 0; i < valueList.size(); i++) { // iterate valueList;
            if (valueList.get(i).equals(operator)) { // if operator occur;
                double operand1 = Double.parseDouble(valueList.get(i - 1)); // set first value into operand1; eg.. 5+3,
                                                                            // operand1 = 5;
                double operand2 = Double.parseDouble(valueList.get(i + 1)); // set second value into operand2; eg.. 5+3,
                                                                            // operand2 = 3;
                double result = 0.0;

                switch (operator) { // switch using operator and set result;
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
                valueList.set(i - 1, String.valueOf(result)); // set result at index of first operand(operand1);
                valueList.remove(i); // Remove operator
                valueList.remove(i); // Remove second operand(operand2);
                i--; // Adjust index after removal
            }
        }
    }

    public String getResult() {
        return sResult; // return result;
    }

}

class Calculate extends JFrame implements ActionListener, KeyListener {

    JFrame frame;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, equal, ac;
    JLabel display;
    JScrollPane displayContainer;
    String str = ""; // to store expression; append oneByOne char into str;

    Calculate() {
        // frame;
        frame = new JFrame("Calculator");
        frame.setLayout(null);
        frame.setSize(343, 500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // icon;
        ImageIcon frameIcon = new ImageIcon("FrameSwing/res/calculator.png");
        frame.setIconImage(frameIcon.getImage());

        // fonts, color and border;
        Font dFont = new Font("Monospaced", Font.BOLD, 40); // display font;
        Font bFont = new Font("Monospaced", Font.PLAIN, 25); // button font;
        Border border = BorderFactory.createLineBorder(new Color(0xFFFFFF), 0);// white, 0px;

        // display or label;
        display = new JLabel("0");
        display.setFont(dFont);
        display.setBorder(border);
        display.setForeground(new Color(0xFFFFFF));
        display.setBackground(new Color(0x123456));
        display.setOpaque(true);
        display.setHorizontalAlignment(JLabel.RIGHT);

        // display container or ScrollPane;
        displayContainer = new JScrollPane(display);
        displayContainer.setBounds(5, 10, 325, 150);

        // buttons;
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        equal = new JButton("=");

        ac = new JButton("AC");

        // buttons properties;
        int c1left = 5; // first column button left margin;
        int c2left = 90; // second column button left margin;
        int c3left = 175; // third column button left margin;
        int c4left = 260; // fourth column button left margin;

        int r1top = 230; // first row buttons top margin;
        int r2top = 290; // second row buttons top margin;
        int r3top = 350; // third row buttons top margin;
        int r4top = 410; // fourth row buttons top margin;

        int bw = 65; // button width;
        int bh = 40; // button height;

        // set button x, y, width, height;
        b1.setBounds(c1left, r1top, bw, bh);
        b2.setBounds(c2left, r1top, bw, bh);
        b3.setBounds(c3left, r1top, bw, bh);

        b4.setBounds(c1left, r2top, bw, bh);
        b5.setBounds(c2left, r2top, bw, bh);
        b6.setBounds(c3left, r2top, bw, bh);

        b7.setBounds(c1left, r3top, bw, bh);
        b8.setBounds(c2left, r3top, bw, bh);
        b9.setBounds(c3left, r3top, bw, bh);

        b0.setBounds(c2left, r4top, bw, bh);

        add.setBounds(c4left, r1top, bw, bh);
        sub.setBounds(c4left, r2top, bw, bh);
        mul.setBounds(c4left, r3top, bw, bh);
        div.setBounds(c4left, r4top, bw, bh);

        equal.setBounds(c3left, r4top, bw, bh);
        ac.setBounds(c1left, r4top, bw, bh);

        // set button color;
        b1.setBackground(new Color(0x90bbd1));
        b2.setBackground(new Color(0x90bbd1));
        b3.setBackground(new Color(0x90bbd1));
        b4.setBackground(new Color(0x90bbd1));
        b5.setBackground(new Color(0x90bbd1));
        b6.setBackground(new Color(0x90bbd1));
        b7.setBackground(new Color(0x90bbd1));
        b8.setBackground(new Color(0x90bbd1));
        b9.setBackground(new Color(0x90bbd1));
        b0.setBackground(new Color(0x90bbd1));

        add.setBackground(new Color(0xe4b5eb));
        sub.setBackground(new Color(0xe4b5eb));
        mul.setBackground(new Color(0xe4b5eb));
        div.setBackground(new Color(0xe4b5eb));
        equal.setBackground(new Color(0xe4b5eb));

        ac.setBackground(new Color(0xf5aeba));

        // set button border;
        b1.setBorder(border);
        b2.setBorder(border);
        b3.setBorder(border);
        b4.setBorder(border);
        b5.setBorder(border);
        b6.setBorder(border);
        b7.setBorder(border);
        b8.setBorder(border);
        b9.setBorder(border);
        b0.setBorder(border);
        add.setBorder(border);
        sub.setBorder(border);
        mul.setBorder(border);
        div.setBorder(border);
        equal.setBorder(border);
        ac.setBorder(border);

        // set button font;
        b1.setFont(bFont);
        b2.setFont(bFont);
        b3.setFont(bFont);
        b4.setFont(bFont);
        b5.setFont(bFont);
        b6.setFont(bFont);
        b7.setFont(bFont);
        b8.setFont(bFont);
        b9.setFont(bFont);
        b0.setFont(bFont);
        add.setFont(bFont);
        sub.setFont(bFont);
        mul.setFont(bFont);
        div.setFont(bFont);
        equal.setFont(bFont);
        ac.setFont(bFont);

        // focusable;
        b1.setFocusable(false);
        b2.setFocusable(false);
        b3.setFocusable(false);
        b4.setFocusable(false);
        b5.setFocusable(false);
        b6.setFocusable(false);
        b7.setFocusable(false);
        b8.setFocusable(false);
        b9.setFocusable(false);
        b0.setFocusable(false);
        add.setFocusable(false);
        sub.setFocusable(false);
        mul.setFocusable(false);
        div.setFocusable(false);
        equal.setFocusable(false);
        ac.setFocusable(false);

        // add component into frame;
        frame.add(displayContainer);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);

        frame.add(add);
        frame.add(sub);
        frame.add(mul);
        frame.add(div);
        frame.add(equal);

        frame.add(ac);

        // action;
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        equal.addActionListener(this);
        ac.addActionListener(this);

        // key action;
        // b1.addKeyListener(this);
        // b2.addKeyListener(this);
        // b3.addKeyListener(this);
        // b4.addKeyListener(this);
        // b5.addKeyListener(this);
        // b6.addKeyListener(this);
        // b7.addKeyListener(this);
        // b8.addKeyListener(this);
        // b9.addKeyListener(this);
        // b0.addKeyListener(this);

        // add.addKeyListener(this);
        // sub.addKeyListener(this);
        // mul.addKeyListener(this);
        // div.addKeyListener(this);

        // equal.addKeyListener(this);
        // ac.addKeyListener(this);

        frame.addKeyListener(this);

        // frame;
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // action;
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            System.out.println("1"); // log;
            System.out.println(expression("1")); // append str in expression;
            display.setText(str);

        }
        if (e.getSource() == b2) {
            System.out.println("2"); // log;
            System.out.println(expression("2")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b3) {
            System.out.println("3"); // log;
            System.out.println(expression("3")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b4) {
            System.out.println("4"); // log;
            System.out.println(expression("4")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b5) {
            System.out.println("5"); // log;
            System.out.println(expression("5")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b6) {
            System.out.println("6"); // log;
            System.out.println(expression("6")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b7) {
            System.out.println("7"); // log;
            System.out.println(expression("7")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b8) {
            System.out.println("8"); // log;
            System.out.println(expression("8")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b9) {
            System.out.println("9"); // log;
            System.out.println(expression("9")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == b0) {
            System.out.println("0"); // log;
            System.out.println(expression("0")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == add) {
            System.out.println("add"); // log;
            System.out.println(expression("+")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == sub) {
            System.out.println("sub"); // log;
            System.out.println(expression("-")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == mul) {
            System.out.println("mul"); // log;
            System.out.println(expression("x")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == div) {
            System.out.println("div"); // log;
            System.out.println(expression("/")); // append str in expression;
            display.setText(str);
        }
        if (e.getSource() == equal) {
            System.out.println("equal"); // log;

            if (str != "") { // "equal" button works if str contains expression;
                Process obj = new Process(str + "$"); // pass str+$; eg.. 4-1+2$;
                display.setText(obj.getResult()); // show result on display;
                str = obj.getResult(); // remember expression;
            }

            // str = ""; //reset display; //forgot expression after "equal" button clicked;
        }
        if (e.getSource() == ac) {
            System.out.println("AC"); // log;
            str = ""; // reset, overwrite;
            display.setText("0");
        }
    }

    public String expression(String str) { // build expression by appending char in string;
        return this.str = this.str + str;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_1:
                expression("1");
                break;
            case KeyEvent.VK_2:
                expression("2");
                break;
            case KeyEvent.VK_3:
                expression("3");
                break;
            case KeyEvent.VK_4:
                expression("4");
                break;
            case KeyEvent.VK_5:
                expression("5");
                break;
            case KeyEvent.VK_6:
                expression("6");
                break;
            case KeyEvent.VK_7:
                expression("7");
                break;
            case KeyEvent.VK_8:
                expression("8");
                break;
            case KeyEvent.VK_9:
                expression("9");
                break;
            case KeyEvent.VK_0:
                expression("0");
                break;
            case KeyEvent.VK_ADD:
                expression("+");
                break;
            case KeyEvent.VK_SUBTRACT:
                expression("-");
                break;
            case KeyEvent.VK_MULTIPLY:
                expression("x");
                break;
            case KeyEvent.VK_DIVIDE:
                expression("/");
                break;
            case KeyEvent.VK_ENTER:
                if (!str.isEmpty()) {
                    Process obj = new Process(str + "$");
                    display.setText(obj.getResult());
                    str = obj.getResult();
                }
                break;
            case KeyEvent.VK_BACK_SPACE:
                if (!str.isEmpty()) {
                    str = str.substring(0, str.length() - 1);
                    display.setText(str.isEmpty() ? "0" : str);
                }
                break;
            case KeyEvent.VK_ESCAPE:
                str = "";
                display.setText("0");
                break;
        }
        display.setText(str);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}

public class j002_calculator {
    public static void main(String[] args) {
        System.out.println("Status: Loading...");
        new Calculate();
        System.out.println("Status: Complete");
    }
}
