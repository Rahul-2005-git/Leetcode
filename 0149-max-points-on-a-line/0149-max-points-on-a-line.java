class Solution {
    public int maxPoints(int[][] points) {
        
        int res=2;
        if(points.length<3)return points.length;
        
        for(int k=0;k<points.length-1;k++){

            for(int j=k+1;j<points.length;j++){
        int dx=points[j][0]-points[k][0];
        int dy=points[j][1]-points[k][1];
            int count=0;

        for(int i=0;i<points.length;i++){
           int  x=points[i][0]-points[k][0];
            int y=points[i][1]-points[k][1];
           if(dx*y==dy*x)count++;
        }

        res=Math.max(res,count);
            }

        }
        return res;
    }
}
 