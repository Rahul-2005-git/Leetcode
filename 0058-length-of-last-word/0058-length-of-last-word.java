class Solution {
    public int lengthOfLastWord(String s) {
        // String[] words = s.split("\\s+");
        // int len=words.length;
        // int llen=words[len-1].length();

        int i=s.length()-1;
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }

        int llen=0;
        while(i>=0 && s.charAt(i)!=' '){
            llen++;
            i--;
        }
        
        
        return llen;
    }
}