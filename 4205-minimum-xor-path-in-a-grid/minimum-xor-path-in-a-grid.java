class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Set<Integer>[][] dp = new HashSet[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                dp[i][j] = new HashSet<>();
                if(i==0 && j==0){
                    dp[i][j].add(grid[i][j]);
                    continue;
                }
                if(i>0){
                    for(int val:dp[i-1][j]){
                        dp[i][j].add(val^grid[i][j]);
                    }
                }
                if(j>0){
                    for(int val :dp[i][j-1]){
                        dp[i][j].add(val^grid[i][j]);
                    }
                }
            }
        }
            int res = Integer.MAX_VALUE;
            for(int val :dp[m-1][n-1]){
                res = Math.min(res,val);
            }
            return res;
        }
    //     int row = grid[0].length;
    //     int col = grid.length;
    //     int ans = gridCal(0 , 0 , grid[0][0],int[][] grid);
    //     return ans;
    // }
    // public static int gridCal(int a , int b , int x , int row , int col){
    //     int curr = 
    //     if(a==row & b == col) x = Math.min(x , gridCal(a , b ,x , row ,col));
    //     if(a<row) {
    //         x ^= gridCal(a+1 , b , x , row , col);
    //     }
    //     if(b<col){
    //         x^= gridCal(a , b+1 , x , row , col);
    //     }
    //     return x ; 
      
}