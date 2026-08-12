class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int curr=0;
        int curc=0;
       Queue<int[] > queue =new LinkedList<>();
  
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2) {
                    curr=i;
                    curc=j;
                   
                   queue.offer(new int[]{i,j});
                }
            }
        }
       
       
       
      

        int res=0;
        int f=0;
    
       while(!queue.isEmpty()){
            res++;
            f=1;

            int size=queue.size();
            for(int i=0;i<size;i++){

            int [] temp=queue.poll();
            curr=temp[0];
            curc=temp[1];

        if(curr-1>=0 && grid[curr-1][curc]==1){
           
            grid[curr-1][curc]=2;
            queue.offer(new int[]{curr - 1, curc});
        }
        if(curr+1<row&& grid[curr+1][curc]==1){
         
            grid[curr+1][curc]=2;
            queue.offer(new int[]{curr + 1, curc});
        }
        if(curc-1>=0&& grid[curr][curc-1]==1){
          
            grid[curr][curc-1]=2;
            queue.offer(new int[]{curr , curc-1});
        }
        if(curc+1<col&& grid[curr][curc+1]==1){
           
            grid[curr][curc+1]=2;
            queue.offer(new int[]{curr, curc+1});
        }
        
        }
       } 
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(grid[i][j]==1)return -1;
                }
            }
     
            return res-f;
        
    }
    

}