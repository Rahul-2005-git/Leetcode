class Solution {
    public long sumAndMultiply(int n) {

        long x=0;
        long sum=0;
        int temp=0;
        int i=1;
        while(n>0){
            temp=n%10;

            n=n/10;
            if(temp!=0){
                sum=sum+temp;
                
                x=x+temp*i;
                i=i*10;

        }
        }
        return x*sum;
    }
}