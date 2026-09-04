class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        if(color==org) return image;
        dfs(image,sr,sc,color,org);
        return image;
    }
    public void dfs(int[][] image, int x, int y, int n,int org)
    {
        if(x<0 || y<0 || x>=image.length || y>=image[0].length) return;
        if (image[x][y] != org)
            return;
        image[x][y]=n;
        dfs(image, x-1, y, n, org);
        dfs(image, x+1, y, n, org);
        dfs(image, x, y+1, n, org);
        dfs(image, x, y-1, n, org);
    }
}