class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int num:nums) sum+=num;

        int target=sum/2;
        if(sum%2!=0) return false;
        int dp[][]=new int[n][target+1];
        for(int i=0;i<n;i++)
        {
            java.util.Arrays.fill(dp[i],-1);
        }
        return solve(nums,n-1,target,dp);
    }
    public static boolean solve(int nums[],int index,int target,int dp[][])
    {
        if(target==0) return true;
        if(index<0) return false;
        if(dp[index][target]!=-1) return dp[index][target]==1;
        boolean notTake=solve(nums,index-1,target,dp);
        boolean take=false;
        if(target>=nums[index])
        {
            take=solve(nums,index-1,target-nums[index],dp);
        }
        boolean res=take||notTake;
        dp[index][target]=res?1:0;
        return res;
    }
}