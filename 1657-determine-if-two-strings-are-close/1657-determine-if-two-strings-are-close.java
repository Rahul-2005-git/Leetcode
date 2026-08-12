class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if(word1.length()!= word2.length())return false;
        

        int [] freq1=new int[26];
        int [] freq2=new int[26];

        for(char ch:word1.toCharArray()){
            freq1[ch-'a']++;
            if(word2.indexOf(ch)==-1) return false;
        }
        for(char ch:word2.toCharArray()){
            freq2[ch-'a']++;
          
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);


        for(int i=25;i>25-word1.length() && i>=0;i--){
            if(freq1[i]!=freq2[i])return false;
        }
        return true;
    }
}