class Solution {
    public int fn(int ind, int n,int []dp){
        if(ind>n)return 0;
        if(ind==n)return 1;
        if(dp[ind]!=-1)return dp[ind];
        int fs=fn(ind+1,n,dp);
        int ss=fn(ind+2,n,dp);
        return dp[ind]=fs+ss;
    }
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fn(0,n,dp);
    }
}