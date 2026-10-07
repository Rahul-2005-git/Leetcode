class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char target = board[i][j];
                if(target=='.')continue;

                for(int k=0;k<9;k++){
                    if(j!=k && board[i][k]==target){
                        return false;
                    }

                    if(i!=k && board[k][j]==target){
                        return false;
                    }
                  
                }
                int bi=(i/3)*3;
                int bj=(j/3)*3;
                System.out.println(target + " "+ bi + "  "+ bj);

                for(int a=bi;a<bi+3;a++){
                    for(int b=bj;b<bj+3;b++){
                        if(a!=i && b!=j && board[a][b]==target){
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}