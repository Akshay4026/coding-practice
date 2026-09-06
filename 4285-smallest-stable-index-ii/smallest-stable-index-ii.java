class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] fromR = new int[nums.length];
        int[] fromL = new int[nums.length];
        int n = nums.length;
        fromL[0] = nums[0];
        fromR[nums.length-1] = nums[nums.length-1];
        for(int i=1 ; i<nums.length;i++){
            fromL[i] = Math.max(fromL[i-1], nums[i]);

            fromR[n-i-1] = Math.min(fromR[n-i] , nums[n-i-1]);
        }

        for(int i=0;i<n ;i++){
            if(fromL[i]-fromR[i]<=k) return i;
        }

        return -1;
    }
}