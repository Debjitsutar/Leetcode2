class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(int i=0;i<n;i++)
        {
            java.util.Arrays.fill(dp[i],-1);
        }
        int ans=solve(coins,n-1,amount,dp);
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public int solve(int coins[],int index,int amount,int dp[][])
    {
        if(amount==0) return 0;
        if(index<0) return Integer.MAX_VALUE;
        if(dp[index][amount]!=-1) return dp[index][amount];

        int notTake=solve(coins,index-1,amount,dp);
        int take=Integer.MAX_VALUE;
        if(coins[index]<=amount)
        {
            int res=solve(coins,index,amount-coins[index],dp);
            if(res!=Integer.MAX_VALUE) take=1+res;
        }
        dp[index][amount]=Math.min(take,notTake);
        return dp[index][amount];
    }
}