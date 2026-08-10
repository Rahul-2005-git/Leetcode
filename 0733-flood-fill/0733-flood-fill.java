class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int oldColor=image[sr][sc];
        if(oldColor==color)return image;
        int row=image.length;
        int col=image[0].length;

        dfs(image,sr,sc,row,col,oldColor,color);
        return image;
    }
    void dfs(int [][] image,int sr,int sc,int row,int col,int oldColor,int color){
        if(sr<0 || sc<0 ||sc>=col || sr>=row || image[sr][sc]!=oldColor )
        return ;

        image[sr][sc]=color;
        dfs(image,sr+1,sc,row,col,oldColor,color);
        dfs(image,sr-1,sc,row,col,oldColor,color);
        dfs(image,sr,sc+1,row,col,oldColor,color);
        dfs(image,sr,sc-1,row,col,oldColor,color);
    }
}