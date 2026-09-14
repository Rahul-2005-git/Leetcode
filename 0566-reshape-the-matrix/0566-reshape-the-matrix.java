class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int m=mat.length;
        int n=mat[0].length;
        int [] arr=new int[m*n];

        if(n*m!=r*c)return mat;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i*n+j]=mat[i][j];
            }
        }
        
        int [][]res =new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
                res[i][j]=arr[i*c+j];
            }
        }
        return res;
    }
}