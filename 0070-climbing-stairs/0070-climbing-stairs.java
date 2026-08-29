class Solution {
    public int helper(int dp[],int n)
    {
        if(n<=2) return n;
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;

        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++) dp[i]=-1;
        return helper(dp,n);
    }
}