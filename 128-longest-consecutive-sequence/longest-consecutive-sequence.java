class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        // HashSet<Integer> seen = new HashSet<>(); 
        for(int i:nums){
            hset.add(i);
        }
        int seq= 0;
        int maxSeq = 0;
        for(int i=0;i<nums.length;i++){ 
            int x = nums[i];
            // if(seen.contains(x)) break;
            if(!hset.contains(x-1)){
                seq =1;
                while(hset.contains(x+1)){
                    hset.remove(x+1);
                    seq++;
                    x++;
                    // seen.add(x); 
                }
                maxSeq = Math.max(maxSeq , seq);
                // seq=0;
            }
        }
        return maxSeq;
    } 
} 
    