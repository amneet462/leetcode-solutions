class Solution {
     public int fn(int ind, int n,int []dp,int[]cost){
        if(ind>=n)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int fs=fn(ind+1,n,dp,cost)+cost[ind];
        int ss=fn(ind+2,n,dp,cost)+cost[ind];
        return dp[ind]=Math.min(fs,ss);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return Math.min(fn(0,n,dp,cost),fn(1,n,dp,cost));
    }
}