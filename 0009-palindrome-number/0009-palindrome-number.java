class Solution {
    public boolean isPalindrome(int x) {
        // System.out.println(x);

        // if(x==121){
        // return true;
        // }
        // if(x==0)return true;

    int rev=0;
    int num=x;
    int i=0;
    while(num>0){
        i=num%10;
        rev=rev*10+i;
        num=num/10;
    }
    if(rev==x)return true;
        

        return false;
    }
}