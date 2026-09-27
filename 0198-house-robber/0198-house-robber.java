class Solution {
    public int house(int nums[],int dp[],int n)
    {
        if(n<=0) return 0;
        if(dp[n]!=-1) return dp[n];
        int r=nums[n-1]+house(nums,dp,n-2);
        int s=house(nums,dp,n-1);

        dp[n]=Math.max(r,s);
        return dp[n];

    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return house(nums,dp,n);
    }
}