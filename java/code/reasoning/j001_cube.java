package reasoning; // package name

import java.util.Scanner; // import Scanner

class cubeS { // class for single coloured cube
    public int n; // nuber of blocks in single line
    public int result; // result

    public void setn(int n) { // setting the value of n
        this.n = n;
    }

    public int getOne() { // get single colour side cube in cubeS
        result = 6 * ((n - 2) * (n - 2));
        return result;
    }

    public int getTwo() { // get two colour side cube in cubeS
        result = 12 * (n - 2);
        return result;
    }

    public int getThree() { // get three colour side cube in cubeS
        return 8;
    }

    public int getZero() { // ger non coloured side cube in cubeS
        result = (n - 2) * (n - 2) * (n - 2);
        return result;
    }

    public int getTotal() { // get total number of cubes in cubeS
        result = n * n * n;
        return result;
    }
}

// single colour
// non colour
// c1 and c2

class cubeTwo extends cubeS { // multi colour cube which have all the features of single colour cube
    public int getOne() { // get one side coloured cube in cubeM
        result = 4*((n-2)*(n-2));
        return result;
    }

    public int getZero() { // get non coloured side cube in cubeM
        result = ((n-2)*(n-2)*(n-2))+(2*((n-2)*(n-2)));
        return result;
    }

    public int getBothTwo() { // get the number of cube which have both two colour
        result = 4*(n-2);
        return result;
    }
}

// single colour
// non colour
// three colour
// c1 and c2
// c1 and c3
// c2 and c3

class cubeThree extends cubeS {

    public int getC1C2() {
        result = 4*(n-2);
        return result;
    }

    public int getOnly1(){
        result = 2*((n-2)*(n-2));
        return result;
    }
}

public class j001_cube { // file name

    static void invalid() { // method for invalid input
        System.out.println("Invalid Input");
    }

    public static void main(String[] args) { // main method
        Scanner in = new Scanner(System.in); // obj for scanner

        cubeS singleColour = new cubeS(); // obj for cubeS
        cubeTwo twoColour = new cubeTwo(); // obj for cubeM (two colour cube)
        cubeThree threeColour = new cubeThree(); // obj for cubeM (three colour cube)

        boolean b = true;

        while (b) {

            System.out.println("*****************************************");
            System.out.println("1. Single Colour"); // first options
            System.out.println("2. Multi colour");
            System.out.println("0. EXIT");
            System.out.println("*****************************************");

            System.out.print("Select: ");
            int cho = in.nextInt(); // choosing option

            if (cho != 0 && (cho <= 2)) {
                System.out.print("Enter the number of blocks in single line: ");
                int n = in.nextInt(); // n is the number of block in single line ==> input
                if (n > 0) {
                    singleColour.setn(n); // setting the value of n
                } else {
                    System.out.println("default value = 2");
                    singleColour.setn(2);
                }
            }

            switch (cho) {
                case 0:
                    System.out.println("Thanks for using");
                    b = false;
                    break;

                case 1:
                    System.out.println("*****************************************");
                    System.out.println("one side colour: " + singleColour.getOne()); // call
                    System.out.println("Two side colour: " + singleColour.getTwo());
                    System.out.println("Three side colour: " + singleColour.getThree());
                    System.out.println("Zero side colour: " + singleColour.getZero());
                    System.out.println("Total cubes: " + singleColour.getTotal());
                    System.out.println("*****************************************");
                    break;

                case 2:
                    System.out.println("*Same colour only have on opposite side*");
                    System.out.print("Enter the total number of colour used to paint cube: ");
                    int colourN = in.nextInt(); // number of colour on cube

                    if (colourN == 1 || colourN == 0 || colourN == 6) {
                        System.out.println("This is not a multi colour cube");
                    } else if (colourN == 2) {
                        System.out.print("Enter colour1: "); // input colour name
                        in.nextLine(); // consume next line char
                        String c1 = in.nextLine();
                        System.out.print("Enter colour2: ");
                        String c2 = in.nextLine();

                        System.out.println("*****************************************");
                        System.out.println("One side colour: " + twoColour.getOne()); // call
                        System.out.println("Zero side colour: " + twoColour.getZero());
                        System.out.println(c1 + " and " + c2 + " colour: " + twoColour.getBothTwo());
                        System.out.println("*****************************************");
                    } else if (colourN == 3) {
                        System.out.print("Enter colour1: "); // input colour name
                        in.nextLine(); // consume next line char
                        String c1 = in.nextLine();
                        System.out.print("Enter colour2: ");
                        String c2 = in.nextLine();
                        System.out.print("Enter colour3: ");
                        String c3 = in.nextLine();

                        System.out.println("*****************************************");
                        System.out.println("One side colour: " + singleColour.getOne());
                        System.out.println("Zero side colour: " + singleColour.getZero());
                        System.out.println("only have colour " + c1 + " " + threeColour.getOnly1());
                        System.out.println("only have colour " + c2 + " " + threeColour.getOnly1());
                        System.out.println("only have colour " + c3 + " " + threeColour.getOnly1());
                        System.out.println(c1 + " and " + c2 + " colours: " + threeColour.getC1C2());
                        System.out.println(c1 + " and " + c3 + " colours: " + threeColour.getC1C2());
                        System.out.println(c2 + " and " + c3 + " colours: " + threeColour.getC1C2());
                        System.out.println("*****************************************");
                    } else {
                        invalid();
                    }
                    break;

                default:
                    invalid();
            }
        }
        in.close();
    }
}
