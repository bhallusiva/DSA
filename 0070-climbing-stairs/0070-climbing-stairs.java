class Solution {

    private int find(int n, int[] dp) {

        if(n == 0)
            return 1;

        if(n < 0)
            return 0;

        if(dp[n] != 0)
            return dp[n];

        dp[n] = find(n - 1, dp) + find(n - 2, dp);

        return dp[n];
    }

    public int climbStairs(int n) {

        int[] dp = new int[n + 1];

        return find(n, dp);
    }
}