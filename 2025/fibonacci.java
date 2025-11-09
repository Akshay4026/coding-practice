import java.util.Arrays;

public class fibonacci {
    public static void main(String[] args) {
        fibonacci abc = new fibonacci();
        int a[] = abc.fib(5);
        System.out.println(Arrays.toString(a));
    }
    public int[] fib(int num ){
        int[] ans = new int[num];
        ans[0]=0;
        ans[1]=1;
        for(int i=2;i<num;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans;
    }
}
