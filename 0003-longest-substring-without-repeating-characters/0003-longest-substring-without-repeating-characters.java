class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int ans=0;

        HashMap<Character, Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(map.containsKey(ch)) left=Math.max(map.get(ch)+1,left);
            map.put(ch,right);

            ans=Math.max(right-left+1,ans);
        }
        return ans;
    }
}