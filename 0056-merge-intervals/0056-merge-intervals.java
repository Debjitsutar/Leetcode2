class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> list=new ArrayList<>();
        
        for(int interval[] : intervals)
        {
            int start=interval[0];
            int end=interval[1];

            if(list.isEmpty () || start>list.get(list.size()-1)[1])
            {
                list.add(new int[]{start,end});
            }
            else
            {
                int last[]=list.get(list.size()-1);
                last[1] = Math.max(last[1], end);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}