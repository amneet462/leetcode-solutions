class Solution {
    public int fn(int[] coins, int idx, int amount,int[][]dp){
        if(idx==0){
            if(amount%coins[idx]==0){
                return amount/coins[idx];
            }else{
                return (int)1e9;
            }
        }
        if(dp[idx][amount]!=-1)return dp[idx][amount];
        int pick=Integer.MAX_VALUE;
        int notpick=0+fn(coins, idx-1,amount,dp);
        if(coins[idx]<=amount){
            pick=1+fn(coins,idx,amount-coins[idx],dp);
        }
        return dp[idx][amount]= Math.min(pick,notpick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int []row:dp){
        Arrays.fill(row,-1);}
        
        int ans = fn(coins, n - 1, amount, dp);

        return ans >= 1e9 ? -1 : ans;
    }
}