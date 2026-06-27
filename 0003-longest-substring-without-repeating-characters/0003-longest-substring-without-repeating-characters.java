class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        
        int start=0,end=0;
        int len=0;
        int ML=0;

        for(int i=0;i<s.length();i++){
            int t=start;
            len=0;
            while(t<i ){
                if(s.charAt(i)==s.charAt(t)){
                     start=t+1;
                     break;
                     }

                else{
                    len++;
                    System.out.println(s.charAt(i)+" "+ len);
                    t++;
                    }
             }
             
                    ML=Math.max(ML,len); 

        }
        return ML+1;

    }
}