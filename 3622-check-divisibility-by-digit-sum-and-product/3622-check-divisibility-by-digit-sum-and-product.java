class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;

        while(num!=0){
            int temp=num%10;
            num/=10;
            sum+=temp;
            product*=temp;
        }

        return n%(sum+product)==0;
    }
}