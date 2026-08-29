class Solution {
    public int house(int nums[],int n,int dp[])
    {
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        
        

        int rob=nums[n]+house(nums,n-2,dp);
        int skip=house(nums,n-1,dp);

        

        return dp[n]=Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return house(nums,n-1,dp);
    }
}