import java.util.*;
public class insertionsort {

    //Insertion sorting- 
    // This sorting technique works in two parts sorted part | unsorted part
    // we keep moving to right side by sorting 
    //to put it simple we will move to right by selection each element from unsorted array and 
    // insert that at a correct position
    public static void main(String[] args) {
        insertionsort ins = new insertionsort();
        int[] ans = ins.Isort(new int[]{5,2,7,10,1});
        System.out.println(Arrays.toString(ans));
    }
    
    public int[] Isort(int[] arr){

        for(int i=1;i<arr.length;i++){
             int temp = arr[i];//store the fiirst element of unsorted array and insert it at a correct place
             int j = i-1;//assign the last element index of the sored array
             while( j >=0 && arr[j]>temp){ // two conditions - index should be equal or greater than 0 || the current temp value less than first element of sorted element 
                arr[j+1]=arr[j]; // move the greater element which is in sorted array to right (increasinng teritory)
                j--; // move left to check next element in sorted array
             }
             arr[j+1]= temp; // we will asign the value to j+1 as the last step in that while is i-- which is failed to satisfy our condition before
        }
        return arr;
    }
}
