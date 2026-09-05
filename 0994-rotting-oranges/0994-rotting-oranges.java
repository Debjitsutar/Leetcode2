class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;

        Queue<int[]> q=new LinkedList<>();
        int cnt=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1) cnt++;
            }
        }
        if(cnt==0) return 0;
        int t=0;
        int d[][]={{-1,0},{1,0},{0,-1},{0,1}};
        while(!q.isEmpty())
        {
            int size=q.size();
            boolean rotten=false;
            for(int i=0;i<size;i++)
            {
                int curr[]=q.poll();
                int x=curr[0],y=curr[1];
                for(int dir[]:d)
                {
                    int nx=dir[0]+x;
                    int ny=dir[1]+y;
                    if(nx>=0 && ny>=0 && nx<r && ny<c && grid[nx][ny]==1)
                    {
                        grid[nx][ny]=2;
                        q.offer(new int[]{nx,ny});
                        cnt--;
                        rotten=true;
                    }
                }
            }
            if(rotten) t++;
        }
        return cnt==0?t:-1;
    }
}