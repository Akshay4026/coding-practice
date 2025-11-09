package inheritance;
public class mutilevel {
    
}
class childchildClass extends superClass{
    childchildClass(String name , int rollNo){
        super(name , rollNo);
    }
    public static void main(String[] args) {
        superClass obj = new superClass("AKshay",100);
        System.out.print(obj.rollNo);
    }
    
}
