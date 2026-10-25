class Solution {
    public int maxSubArray(int[] nums) {        
        int j =0;
        int max = Integer.MIN_VALUE;
        int curr = 0;
        while(j<nums.length){
            curr = Math.max(curr , 0);
            curr +=nums[j];
            max = Math.max(curr , max);
            j++;
        }
        return max;
    }
}