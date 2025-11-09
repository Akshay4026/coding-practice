package inheritance;

public class inheritance{

    public static void main(String[] args) {
        childClass obj1 = new childClass("akshay", 6605);
        // childClass obj = new childClass();
        obj1.printName();
        obj1.printNo(); 
    }
    }

class superClass{
    String name ;
    int rollNo;
    superClass(){}
    superClass(String name , int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public void printName(){
        System.out.println(this.name);
    }
}

class childClass extends superClass{
    childClass(String name , int rollNo){
        super(name, rollNo);
    }
    childClass(){}
    public void printNo(){
        System.out.print(rollNo);
    }
}