import java.util.Arrays;
class kmp{
    public static void main(String[]args){
        kmp obj = new kmp();
        System.out.println(Arrays.toString(obj.KmpAlgo("aabac")));
    }
    public int[] KmpAlgo(String s){
        int n = s.length();
        int i = 1;
        int len = 0;
        int[] arr = new int[n];
        while (i<n) {
            if(s.charAt(i)==s.charAt(len)){
                len++;
                arr[i]= len;
                i++;
            }
            else{
                if(len!=0){
                    len = arr[len-1];
                }
                else{
                    arr[i]=0;
                    i++;
                }
            }
        }
        return arr;
}
}


