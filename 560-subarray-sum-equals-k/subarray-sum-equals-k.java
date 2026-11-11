class Solution {
    public int subarraySum(int[] nums, int k) {

        int count =0;
        HashMap<Integer,Integer> hsh = new HashMap<>();
        hsh.put(0,1);
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(hsh.containsKey(sum-k)){
                count+= hsh.get(sum-k);
            }
            hsh.put(sum , hsh.getOrDefault(sum,0)+1);
        }
        return count;
        //  int count =0;
        //  for(int i=0;i<nums.length;i++){
        //     int sum =0;
        //     // int a  = nums[i];
        //     for(int j=i;j<nums.length;j++){
        //         sum += nums[j];
        //         if(sum ==k){
        //             count++;
        //         } 
        //         // else if(sum >k) break;
        //     }
        //  }
        //  return count;
    }
}