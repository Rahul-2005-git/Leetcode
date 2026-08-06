class Solution {
    public int smallestNumber(int n, int t) {
        int r;

        while(true){
        int temp=n;
        int p=1;

        while(temp!=0){
            r=temp%10;
            temp=temp/10;
            p=p*r;
        }
        if(p%t==0)return n;
        n++;
    }
     
    }
}