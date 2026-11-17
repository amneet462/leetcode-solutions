class Solution {
     public int fn(int ind,int end,int[] dp,int[]nums){
        if(ind>end)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int pick=fn(ind+2,end,dp,nums)+nums[ind];
        int notpick=fn(ind+1,end,dp,nums);
        return dp[ind]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int[]dp1=new int[n];
        Arrays.fill(dp1,-1);
        int cas1= fn(0,n-2,dp1,nums);
        int[]dp2=new int[n];
        Arrays.fill(dp2,-1);
        int cas2= fn(1,n-1,dp2,nums);
        return Math.max(cas1,cas2);
    }
}