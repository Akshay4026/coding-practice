package DSA;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {10,19,38,9,403,02,5};
        int target = 2;
        // linearSearch obj = new linearSearch();
        int result = searchLiner(arr,target);
        if(result>0 ){
            System.out.println(result);
        }
        else System.out.println("not found");
    }
    public static int searchLiner(int arr[],int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

}
