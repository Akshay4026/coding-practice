import java.util.Scanner;

import javax.swing.text.Style;


public class reverseString {
    public static void main(String[] args) {
        // String str = "Akshay";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuffer res = new StringBuffer();
        for(int i = str.length()-1 ;i>=0;i--){
            res.append(str.charAt(i));
        }

        System.out.println(res);

        if(res.toString().equals(str) ){
            System.out.print("Given String is a palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
