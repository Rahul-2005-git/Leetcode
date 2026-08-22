class Solution {
   

    public int fib(int n) {
        if(n==0)return 0;
        
        int prev2=0;
        int prev1=1;
        int i=2;
        while(i<=n){
           int  curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
            i++;
        }
        return prev1;

        

    }

}