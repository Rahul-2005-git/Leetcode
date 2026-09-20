class Solution {
    public int myAtoi(String s) {
        
       int res=0;
        int start=0;
        int sign=1;
      
        s=s.trim();
        for(int ch:s.toCharArray()){
          
            if(start==0 &&( ch=='-' || ch=='+')){

            if( ch=='-' ){
                sign=-1;
              

            }
            start++;
            }
            else if(ch-'0'<0 || ch-'0'>9)break;
            else{
               
                if (res > (Integer.MAX_VALUE-(ch-'0') ) / 10) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
                res=res*10+(ch-'0');
                start++;
            }
            
        }
        res=sign*res;
        return res;
    }
}