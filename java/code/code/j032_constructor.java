package code;

//Constructors and constructors overloading;
class className {
    private int id;
    private String name;

    public className(){ // Constructors
        id = 0;
        name = "Your-Name";
    }
    public className(int id, String name){  // Constructors overloading
        this.id = id;
        this.name = name;
    }

    public void setId(int id){  // id
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){  // name
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class j032_constructor {
    public static void main(String[] args) {
        className obj = new className();
        // className obj = new className(20, "aasif");
        // set id and name
        // obj.setId(30); // comment
        // obj.setName("java"); // comment

        System.out.println(obj.getId());
        System.out.println(obj.getName());
    }
}
