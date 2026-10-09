class Solution {
    public int findCenter(int[][] edges) {
        
        int n=edges.length;
        int count=0;
        int []arr=new int[n+1];
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<2;j++){

                arr[edges[i][j]-1]++;
            }

        }
        for(int i=0;i<n+1;i++){
            if(arr[i]==n)return i+1;
        }

return 1;
    }
}