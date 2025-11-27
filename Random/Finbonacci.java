import java.util.ArrayList;
import java.util.Scanner;

public class Finbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int first = 0;
        int second = 1;
        for(int i = 0 ;i<limit;i++){
            System.out.println(first);
            int next = first +second;
            first = second ;
            second = next;            
        }
        }
// public static int fib(int n){
//     if(n<=1){
//         return n;
//     }
//     else{
//         return fib(n-1)+fib(n-2);
//     }
}
