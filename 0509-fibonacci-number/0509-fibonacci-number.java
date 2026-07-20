class Solution {
    public int fib(int n) {
        if(n<1)return 0;
        if(n==1)return 1;
        int f=0;
        int fn1=1,fn2=0;
        int i=2;
        // return fib(n-1)+fib(n-2);
        while(i<=n){
            f=fn1+fn2;
            fn2=fn1;
            fn1=f;
            i++;
        }
        return f;

    }
}