class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> set=new HashMap<>();
        int left=0;
        int maxLen=0;

        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);
            if(set.containsKey(ch) && set.get(ch)>= left) left=set.get(ch)+1;
            set.put(ch,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}