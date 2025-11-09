package DSA;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {4,5,9,10,22,38,40,45,46,50,61,100};
        int target = 38;
        int result = searchBinary(arr,target);
        if(result!=-1){
            System.out.println(result);
        }
        else System.out.println("not found");
    }
    public static int searchBinary(int[]arr,int target){
        int left =0;
        int right = arr.length-1;
        for(int i =0;i<arr.length;i++){
            int mid = (left+right)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }
}
