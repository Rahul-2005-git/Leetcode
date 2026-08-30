class Solution {
    public boolean isHappy(int n) {
        int sum;
        int []arr=new int[10];
        while(n>1){
            sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp*temp;
            n=n/10;

        

        }
        n=sum;
        if(n<10){

        if(arr[n]==1)return false;
        arr[n]++;
        }
    }
        return true;
    }
}