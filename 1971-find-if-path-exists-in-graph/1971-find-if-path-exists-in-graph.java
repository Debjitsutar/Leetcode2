class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=new ArrayList<>();
        }
        for(int edge[]:edges)
        {
            int u=edge[0];
            int v=edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        boolean vs[]=new boolean[n];
        vs[source]=true;
        while(!q.isEmpty())
        {
            int cur=q.poll();
            if(cur==destination) return true;
            for(int nei:graph[cur])
            {
                if(!vs[nei]){
                q.offer(nei);
                vs[nei]=true;
            }
        }
    }
    return false;
}
}