class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int i=0;
        int j =0;
        int k = 0;
        arr1[i++]= nums[k++];
        arr2[j++] = nums[k++];
        for(int p =2;p<nums.length;p++){
            if(arr1[i-1]>arr2[j-1]){
                arr1[i++]= nums[p];
            }
            else arr2[j++] = nums[p];
        }

        int[] res = new int[nums.length];

        for(int p=0;p<i;p++){
            res[p] = arr1[p];
        }
        for(int p=0;p<j;p++){
            res[p+i] = arr2[p];
        }

        return res;
    }
    
}