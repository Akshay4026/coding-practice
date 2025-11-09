package DSA;

public class BinarySRecursive {
    public static void main(String[] args) {
        int arr[] ={2,5,6,8,10,14,17,19,23,27,29,100};
        int target = 27;
        int left =0 ;
        int right = arr.length;
        int res = searchBinary(arr,target,left,right);
        if(res!=-1){
            System.out.println(res);
        }
    }

    public static int searchBinary(int[]arr, int target,int left, int right){
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return searchBinary(arr, target, left, mid-1);
        }
        else if(arr[mid]<target){
            return searchBinary(arr, target, mid+1, right);
        }
        return - 1;
    }
}
