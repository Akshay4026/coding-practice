import java.util.ArrayList;
import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Length of array");
        int x = sc.nextInt();
        for(int i = 0;i<x;i++){
            int num = sc.nextInt();
            arr.add(num);
        }
        System.out.println(arr);
        for(int i =0 ;i<x-1 ;i++){
            for(int j=0;j<x-i-1;j++){
                if(arr.get(j)>arr.get(j+1)){
                    int temp = arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp );

                }
            }
        }
        System.out.println(arr);
    }
}
