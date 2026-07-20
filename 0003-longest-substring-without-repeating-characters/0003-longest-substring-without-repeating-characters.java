class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int maxLen=1;
       
        if(s.length()==0)return 0;
        
        

        for(int j=1;j<s.length();j++){
            // maxLen=Math.max(1,maxLen);
            int temp=j-1;
            while(i<=temp){
                if(s.charAt(temp)==s.charAt(j)){
                    i=temp+1;
                    break;
                }
                
                temp--;
            }
                maxLen=Math.max(maxLen,j+1-i);

        }
        return maxLen;
        
    }
}