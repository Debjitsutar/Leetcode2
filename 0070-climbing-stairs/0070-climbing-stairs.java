class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int p2=2;
        int p1=1;
        for(int i=3;i<=n;i++)
        {
            int cur=p1+p2;
            p1=p2;
            p2=cur;
        }
        return p2;
    }
}