package code;

// practice 51-52;
// soulution vid 61;

//#1
// you have to implement a library using java class library.
// methods: addbook, issueBook, returnBook, showAvailableBook.
// properties: array to store the available book.
//             array to store the issueBook;

//#2
// Create a class circle and use inheritance to create another class cylinder from it;
// * Create methods for area and volume; 


//#1 solution;
class Library {
    String[] arrBook = new String[100];
    int index;

    Library(){
        index = 0;
        arrBook[index] = null;
    }

    public void addBook(String book) {
        this.arrBook[index] = book;
        index++;
        System.out.println("********Book added********");
    }

    public void issueBook(String book) {
        for(int i=0; i<arrBook.length; i++){
            if(arrBook[i] == book){
                arrBook[i] = null;
            }
        }
        System.out.println("********Book Issued********");
    }

    public void returnBook(String book) {
        addBook(book);
        System.out.println("********Book returned********");
    }

    public void showAvailableBook() {
        for (int i = 0; i < arrBook.length; i++) {
            if(arrBook[i] == null){
                continue;
            }
            System.out.println(arrBook[i]);
        }
        System.out.println("********Now available********");
    }
}

//#2 solution;
// class Circle{
//     // final float pi = 3.14f;
//     public double pi = Math.PI;
//     public float radius,result;

//     public void setRadius(int radius){
//         this.radius = radius;
//     }

//     public float area(){
//         result =  (float) pi*radius*radius;  //typecast double to float;
//         return result;
//     }

// }

// class Cylinder extends Circle{
//     public float height;

//     public void setHeight(int height){
//         this.height = height;
//     }

//     public float volume(){
//         result = (float) pi*radius*radius*height;  //typecast double to float;
//         return result;
//     }

// }

public class j043_practice51 {
    public static void main(String[] args) {

// #1 solution;
        Library myLibrary = new Library();

        myLibrary.addBook("Maths");
        myLibrary.addBook("Hindi");
        myLibrary.addBook("English");

        myLibrary.showAvailableBook();

        myLibrary.issueBook("Hindi");

        myLibrary.showAvailableBook();

        myLibrary.returnBook("Hindi");

        myLibrary.showAvailableBook();

//#2 solution;

        // System.out.println();
        // Circle myCircle = new Circle();
        // myCircle.setRadius(5);
        // System.out.println("Area of circle: "+myCircle.area());

        // Cylinder myCylinder = new Cylinder();
        // myCylinder.setRadius(5);
        // myCylinder.setHeight(7);
        // System.out.println("Area of cylinder: "+myCylinder.volume());

    }
}
