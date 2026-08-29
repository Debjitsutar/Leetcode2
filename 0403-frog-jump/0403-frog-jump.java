class Solution {
    HashMap<Integer, Integer> map;
    Boolean dp[][];
    int stones[];

    public boolean helper(int index, int jump)
    {
        if(index==stones.length-1) return true;
        if(dp[index][jump]!= null) return dp[index][jump];

        for(int nextJump=jump-1;nextJump<=jump+1;nextJump++)
        {
            if(nextJump<=0) continue;
            int nextP=stones[index]+nextJump;
            if(map.containsKey(nextP))
            {
                int nextI=map.get(nextP);
                if(helper(nextI,nextJump)) return dp[index][jump]=true;
            }
        }
        return dp[index][jump]=false;
    }
    public boolean canCross(int[] stones) {
        this.stones=stones;
        map=new HashMap<>();

        for(int i=0;i<stones.length;i++) map.put(stones[i],i);

        dp=new Boolean[stones.length][stones.length+1];

        if(!map.containsKey(1)) return false;
        return helper(1,1);
    }
}