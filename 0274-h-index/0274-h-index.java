class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);
int count=0;
int res=0;
        for(int i=citations.length-1;i >=0;i--){
            // max=Math.max(max,citations[i]);
            count++;
            if(citations[i] >=count){
               res= Math.max(res,count);
            }
        }
        return res;
    }
}