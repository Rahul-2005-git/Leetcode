class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        
                        for(int ti=0;ti<m;ti++){
                            if(matrix[ti][j]!=0)
                            matrix[ti][j]=-555;
                        }
                        for(int tj=0;tj<n;tj++){
                            if(matrix[i][tj]!=0)
                            matrix[i][tj]=-555;
                        }
                    }
            }
        }

           for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                    if(matrix[i][j]==-555){
                        matrix[i][j]=0;
                    }
            }
           }
    }
}