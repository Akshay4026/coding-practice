class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int curr = 0;
        int min = Integer.MAX_VALUE;
    
        int i =0;
        int j =0;
        while(j<nums.length){
            curr += nums[j++];
            while(curr>=target){
                min = Math.min(min , j-i);
                curr -=nums[i++];
            }
        }
        if(min == Integer.MAX_VALUE) return 0;
        else return min;
    }
}