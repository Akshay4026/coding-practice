public class multiple {
    public static void main(String[] args) {
        lastclass obj = new lastclass();
        obj.printing();
    }
}
/**
 * Innermultiple
 */
 interface interface1 {
    String name = "akshay";
    
}
interface interface2{
    String lastname = "kumar";
}

class lastclass implements interface1 , interface2{
    
    void printing(){
        System.out.println(name); 
        System.out.println(lastname);   
    }

}