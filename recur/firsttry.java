import java.util.ArrayList;
import java.util.HashSet;

public class firsttry {
    
    static void findSubsequence(int id, ArrayList<Integer> lst , int sum , int[] arr , int t){
        long time = System.currentTimeMillis();
        if(id ==arr.length){
            if(sum ==t){
                for(int i :lst) System.out.print(i+"");
                System.out.println();
                long end = System.currentTimeMillis();
                System.out.println(end-time);
            } 
            return;
        }

        lst.add(arr[id]);
        sum+=arr[id];
        findSubsequence(id+1, lst, sum, arr, t);

        sum-=arr[id];
        lst.removeLast();
        findSubsequence(id+1, lst, sum, arr, t);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,5,3,6,6,4,2,2,6,6,76,7};
        HashSet<Integer> hset =new  HashSet<>();
        for(int i: arr) hset.add(i);
        hset.toArray();
        int t = 5;
        // int id =0;
        ArrayList<Integer> lst = new ArrayList<>();
        // int sum =0;
        findSubsequence(0,lst,0,arr,t);
    }
}
