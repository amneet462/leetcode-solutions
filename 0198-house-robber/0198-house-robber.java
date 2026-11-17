class Solution {
    public int fn(int ind, int n,int[] dp,int[]nums){
        if(ind>=n)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int pick=fn(ind+2,n,dp,nums)+nums[ind];
        int notpick=fn(ind+1,n,dp,nums);
        return dp[ind]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return fn(0,n,dp,nums);
    }
}