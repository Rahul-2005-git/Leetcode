class Solution {
    public int pivotInteger(int n) {
        int sum1=1,sum2=(n*(n+1))/2;
        for(int x=1;x<=n;x++){
            if(sum1<sum2){
                sum1+=x+1;
                sum2-=x;
            }
            else if(sum1==sum2){
                return x;
            }
            else{
                return -1;
            }
        }
        return n;

    }
}