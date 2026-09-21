class Solution {
    private int findPaths(int m,int n,int[][] dp)
    {
        
        if(m==0 || n==0)
        {
            return 1;
        }
        if(dp[m][n]!=0)
        {
            return dp[m][n];
        }
        dp[m][n]=findPaths(m-1,n,dp)+findPaths(m,n-1,dp);
        return dp[m][n];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
         return findPaths(m-1,n-1,dp);
    }
}