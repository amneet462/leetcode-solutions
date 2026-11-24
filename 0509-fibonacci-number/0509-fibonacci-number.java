class Solution {
    public int fn( int n, int[]dp){
    if(n<=1)return n;
    if(dp[n]!=-1)return dp[n];
    int fs=fn(n-1,dp);
    int ss=fn(n-2,dp);
    return dp[n]=fs+ss;
    }
    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fn( n, dp);
    }
}