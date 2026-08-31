class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int n = nums.length;
        if(nums.length ==1) return 1;
        if(nums.length ==2) return 2;

        for(int i= 0;i<nums.length;i++){
            int a = nums[i];
            if(a > maxValue) {
                max = i;
                maxValue = a;
                }
            if(a < minValue) {
                min = i;
                minValue = a;
                }
        }
        int fromF = 0;
        int fromB = 0;
        int fromFB = 0;  
        if(min>max){
            fromFB = max + (n-min) +1;
            fromF = min +1;
            fromB = (n - max);
        }
        else {
            fromFB = min + (n-max) +1;
            fromF = max +1;
            fromB = (n - min);
        }
        return Math.min(fromFB , Math.min(fromF , fromB));
    }
}