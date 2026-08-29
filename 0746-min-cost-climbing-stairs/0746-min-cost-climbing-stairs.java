class Solution {
    public int helper(int cost[])
    {
        int n=cost.length;
        

        int zero=0;
        int first=0;

        for(int i=2;i<n+1;i++)
        {
            int cur=Math.min((first+cost[i-1]),(zero+cost[i-2]));
            zero=first;
            first=cur;
        }
        return first;
    }
    public int minCostClimbingStairs(int[] cost) {
        return helper(cost);
    }
}