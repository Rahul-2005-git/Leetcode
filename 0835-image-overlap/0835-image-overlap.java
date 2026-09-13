class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        
        int n=img1.length;
        List<int[]> img21=new ArrayList<>(); 
        List<int[]> img11=new ArrayList<>();

        int size = 2 * n;
int[][] shift = new int[size][size];

        for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                  

                    if(img1[i][j]==1){
                        // img11.add(new ArrayList(){i,j});
                         img11.add(new int[]{i,j});
                    }
                    if(img2[i][j]==1){
                        //  img21.add(new ArrayList(){i,j});
                         img21.add(new int[]{i,j});
                    }
                }
        }
 int res=0;
        for(int[] i1:img11){

            int r1=i1[0];
            int c1=i1[1];

            for(int[] i2:img21){
                int r2=i2[0];
                int c2=i2[1];
                int rows=r2-r1;
                int cols=c2-c1;
               int[] key = new int[]{rows,cols};
                shift[rows+n][cols+n]++;


                res = Math.max(res, shift[rows+n][cols+n]);
            }
        }
        

       

        // for(int i=0;i<size;i++){
        //     for(int j=0;j<size;j++){

        //     res=Math.max(res,shift[i][j]);
        //     }
        // }

        return res;
    }
}