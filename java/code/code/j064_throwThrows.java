package code;  // throw and throws keywords in java


class myNegativeException extends Exception{  //custom exception class;
    @Override
    public String toString(){  // string method to return exception (at place of 'e');
        return "Negative Exceptionnnnn";
    }
    
    public double area(int r) throws myNegativeException {  //method having logic (force programmer to handle this exception);

        if(r<0){  // condition for throwing exception;

            throw new myNegativeException();  //throw exception;
        }

        return Math.PI * r * r;  // if no exception occur, then return area;
    }
}

public class j064_throwThrows {
    public static void main(String[] args){
        myNegativeException obj = new myNegativeException();  // object for custon exception class;

        try{  // put function call into try-catch because of area mehthod throwsss myNegativeException class;
            System.out.println(obj.area(-5));  //call area method;

        }
        catch(Exception e){
            System.out.println(e);  // call toStirng method;
        }
        
    }
}
