class Solution {
    public int arrangeCoins(int n) {
        // int i=0;
        // int count=0;
        // while(n>=0){
        //     i++;
        //     count++;
        //     n=n-i;
        // }
        // return count-1;

        double result = Math.sqrt(1+8.0*n);
        return ((int)(result - 1))/2;
    }
}