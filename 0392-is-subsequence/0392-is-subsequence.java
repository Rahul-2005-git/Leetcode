class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        int j=0;
        if(sl==0)return true;
        if(tl<sl)return false;

        for(int i=0;i<tl;i++){
            if(t.charAt(i)==s.charAt(j)){
                // System.out.println(s.charAt(j));
                j++;
            }
            if(j==sl)return true;
        }
        return false;
    }
}