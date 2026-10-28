class Solution {
    public String[] createGrid(int m, int n) {

        String [] res=new String[m];

        for(int j=0;j<m;j++){
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            if(j==0 || i==n-1){
                    sb.append(".");
                }else{
                    sb.append("#");
                }
            // sb.append(arr[j][i]);
        }
        res[j]=sb.toString();

        }
        return res;
    }
}