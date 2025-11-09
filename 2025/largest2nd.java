public class largest2nd {
    public static void main(String[] args) {
        largest2nd ls = new largest2nd();
        System.out.println(ls.bubbleSort(new int[]{27,48,93,20,4}));
        // System.out.println(ans);
    }
    public int bubbleSort(int[]arr ){
        int n = arr.length;

        for(int i =0;i<2;i++){
            
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[n-2];
    }
}
