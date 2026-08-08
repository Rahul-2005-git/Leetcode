class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res=new ArrayList();
        int j=0;
        for(int i=1;i<=n;i++){
            if(j>=target.length)break; 
            if(target[j]==i){
                res.add("Push");
                j++;
            }
            else{
                res.add("Push");
                res.add("Pop");
            }

        }
        return res;
        
    }
}