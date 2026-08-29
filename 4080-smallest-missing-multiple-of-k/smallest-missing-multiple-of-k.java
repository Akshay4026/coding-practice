class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr = new int[10001];
        for(int i:nums) arr[i]++;

        boolean bool = true;
        int a =1;
        int ans = 0;
        while(bool){
            if(arr[k*a]==0){
                ans = k*a ;
                bool = false;
            }
            a++;
        }

        return ans;
    }
}