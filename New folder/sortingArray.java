class sortingArray{
    public static void main(String[] args) {
        int[] arr = {10, 8, 2, 1, 7, 4, 6}; // Random order
        // for(int i = 0;i <arr.length-1;i++){
        //     for(int j = 0;j<arr.length-i-1;j++){
        //         if(arr[j]>arr[j+1]){
        //             int temp = arr[j+1];
        //             arr[j+1]=arr[j] ;
        //             arr[j]=temp;                }
        //     }
        // }
         for(int i = 0;i <arr.length;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] =temp;
                }
            }}
        for(int i = 0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}