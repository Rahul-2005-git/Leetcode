class Solution {
    int [] dp;

    public int fib(int n) {
        dp=new int[n+1];

        return solve(n);

    }

    int solve(int n){
        if(n==0)return 0;
        if(n==1)return 1;

        
        return solve(n-1)+solve(n-2);
    }
}