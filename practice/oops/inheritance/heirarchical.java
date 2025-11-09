package inheritance;

public class heirarchical {
    public static void main(String[] args) {
        childclass1 obj = new childclass1();
        obj.print();
        childclass2 obj2 = new childclass2();
        obj2.print();
        childclass3 obj3 = new childclass3("DBMS");
        // obj3.print3();
    }
}

class masterClass{
    String subject = "maths";
    String subject2 ="Physics";
    // String subject3 = "Chemistry";
    masterClass(){
    }
    masterClass(String subject3){
        this.subject =subject3;
    }
}

class childclass1 extends masterClass{
    public void print(){
        masterClass obj = new masterClass();
        System.out.println(obj.subject);
    }
}

class childclass2 extends masterClass{
    void print(){
        masterClass obj = new masterClass();
        System.out.println(obj.subject2);
    }
}

class childclass3 extends masterClass{
    childclass3(String subject3){
        super(subject3);
        System.out.println(subject3);
    }
    // void print3(){
    //     // masterClass obj = new masterClass(String subject3);
    // }
}