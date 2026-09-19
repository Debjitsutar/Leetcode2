class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int w=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[w]=nums[i];
                w++;
            }
        }
        while(w<n)
        {
            nums[w]=0;
            w++;
        }
    }
}