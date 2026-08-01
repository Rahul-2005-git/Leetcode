class Solution {
    public int addDigits(int num) {
       int sum=0;
        while(num>0){
            
        sum=0;
       while(num>0){
       int temp=num%10;
       num=num/10;
       sum=sum+temp;
       }
       if(sum>9){
        num=sum;
       }
       else{
        break;
       }
        }
        return sum; 
    }

}