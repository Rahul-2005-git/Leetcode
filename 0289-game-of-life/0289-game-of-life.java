class Solution {
    public void gameOfLife(int[][] board) {
        
        int m=board.length;
        int n=board[0].length;
        int [][]res=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                if(i-1>=0 && j-1>=0)
                if(board[i-1][j-1]==1)count++;
                
                if(i-1>=0 )
                if(board[i-1][j]==1)count++;
                if(i-1>=0 && j+1<n)
                if(board[i-1][j+1]==1)count++;
                if( j-1>=0)
                if(board[i][j-1]==1)count++;
                if(j+1<n)
                if(board[i][j+1]==1)count++;
                if(i+1<m && j-1>=0)
                if(board[i+1][j-1]==1)count++;
                if(i+1<m)
                if(board[i+1][j]==1)count++;
                if(i+1<m && j+1<n)
                if(board[i+1][j+1]==1)count++;


                if(count<2) res[i][j]=0;
                else if(count==2) res[i][j]=board[i][j];
                else if(count==3) res[i][j]=1;
                else res[i][j]=0;

            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=res[i][j];
            }
        }
    }
}