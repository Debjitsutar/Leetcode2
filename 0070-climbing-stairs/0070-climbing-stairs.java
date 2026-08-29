class Solution {
    public int helper(int dp[],int n)
    {
        if(n<=2) return n;
        int p2=1;
        int p=2;
        

        for(int i=3;i<=n;i++)
        {
            int cur=p+p2;
            p2=p;
        p=cur;
        }
        

        return p;
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<n+1;i++) dp[i]=-1;
        return helper(dp,n);
    }
}