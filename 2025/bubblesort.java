import java.util.*;

public class bubblesort {

    //most simple and straightforward techqiue 
    //check place the greater element to the last to put  it simple we sorrt the array from last 
    // goes thorugh loop until you find a greater element and move to right .move until uyou find the place
    
    public static void main(String[] args) {
        bubblesort bs = new bubblesort();
        int ans[] = bs.bubbleSort(new int[]{27,48,93,20,4,0});
        System.out.println(Arrays.toString(ans));
    }
    public int[] bubbleSort(int[]arr ){
        int n = arr.length;

        for(int i =0;i<n;i++){
            
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
