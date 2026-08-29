class Solution {
    public int robbing(int nums[],int start,int end,int dp[])
    {
        if(end<start) return 0;
        if(end==start) return nums[start];

        if(dp[end]!=-1) return dp[end];

        int rob=nums[end]+robbing(nums,start,end-2,dp);
        int skip=robbing(nums,start,end-1,dp);

        return dp[end]=Math.max(rob,skip);
    }
    
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int dp1[]=new int[n];
        Arrays.fill(dp1,-1);
        int case1=robbing(nums,0,n-2,dp1);
        int dp2[]=new int[n];
        Arrays.fill(dp2,-1);
        int case2=robbing(nums,1,n-1,dp2);

        return Math.max(case1,case2);
    }
}