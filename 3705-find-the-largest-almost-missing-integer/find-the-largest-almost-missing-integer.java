class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] arr = new int[51];
        int max = -1;
        for(int i : nums) {
            arr[i]++;
            max = Math.max(i ,max);
        }
        if(k==1){
            for(int i=50 ;i>=0;i--){
                if(arr[i]==1) return i;
            }
        }
        // if(k==1) return max;
        int a = nums[0];
        int b = nums[nums.length-1];
        if(nums.length == k) return max;
        
        if(arr[a]==1 && arr[b]==1) return Math.max(a , b);
        else if(b>a){
            if(arr[b]==1) return b;
            else if(arr[a]==1) return a;
        }
        else if(a>b ){
            if(arr[a]==1) return a;
            else if(arr[b]==1) return b;
        }
        return -1;
        // for(int i=0;i<nums.length-k+1;i++){
        //     int max =0;
        //     for(int j=i;j<i+k;j++){
        //         max = Math.max(max , nums[j]);
        //     }
        //     arr[max]++;
        // }
        // int ans = -1;
        // for(int i=0;i<51;i++){
        //     if(arr[i]==1) {
        //         ans = Math.max(ans , arr[i]);
        //     }
        // }
        // return ans;
    }
}