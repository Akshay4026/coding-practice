class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int ans = Integer.MAX_VALUE;
        boolean bool = false;
         for(int i=0;i<nums.size();i++){
            int sub = 0;
            int currsub = Integer.MAX_VALUE;
            int c =0;
            for(int j=i;j<i+r;j++){
                c++;
                if(j==nums.size())break;
                sub += nums.get(j);
                if(c>=l && c<=r){
                    if(sub>0) {
                        currsub  = Math.min(currsub , sub);
                        bool = true;
                    }
                } 
                else if(c>r) break;
            }
            ans = Math.min(currsub , ans);
        }if(!bool) return -1;
         else return ans;

        // // int len = 0;
        // int minSum =1001;
        // for(int i=0;i<nums.size()-r;i++){
        //     int len =0;
        //     int currSum =0;
        //     for(int j=i;j<i+r;j++){
        //         currSum +=nums.get(j);
        //         // currSum = Math.min(currSum ,0);
        //         if(len>=l){
        //             if(currSum>0){
        //                 minSum = Math.min(minSum , currSum);
        //             }
        //         }
        //         len++;
        //     }
        // }
        // return minSum ;
    // }
        // int[] arr = new int[nums.size()];
        // arr[0] = nums.get(0);
        // for(int i=1;i<nums.size();i++){
        //     arr[i]= nums.get(i)+arr[i-1];
        // }

        // int lmin = 1001;
        // int rmin = 1001;
        // if(arr[l-1]>0) lmin = arr[l-1];
        // if(arr[r-1]>0) rmin = arr[r-1];
        // int j=0;
        // for(int i=l;i<nums.size();i++){
        //     int a = arr[i]-arr[j++];
        //     if(a>0) lmin = Math.min(a , lmin);
        // }
        // int k=0;
        // for(int i=r;i<nums.size();i++){
        //     int a = arr[i]-arr[k++];
        //     if(a>0) rmin = Math.min(a , rmin);
        // }
        // int ans = Math.min(lmin , rmin);
        // if(ans==1001) return -1;
        // else return ans;
    }
    
}