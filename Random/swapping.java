import java.util.Scanner;

/**
 * swapping
 */
public class swapping {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers :");

        int num1= sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("After swapping");
        num1 = num1+num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping"+num1+"and"+num2);
        sc.close();
    }
}