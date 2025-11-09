import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        selectionsort ssort = new selectionsort();
        int[] ans = ssort.Ssort(new int[]{2,4,222,1,4,64,22,9,1000,3494984,413});
        System.out.println(Arrays.toString(ans));
    }
    public int[] Ssort(int[] arr){
        // int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            // int min = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] =arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
