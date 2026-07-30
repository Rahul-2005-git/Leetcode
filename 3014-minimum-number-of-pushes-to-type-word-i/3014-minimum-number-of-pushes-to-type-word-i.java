class Solution {
    public int minimumPushes(String word) {
        
        int n=word.length();
        // if(n<=8)return n;
        // else if(n<=16) return (8+(n-8)*2);
        // else if(n<=40)return (24+(n-16)*3);
        int i=0;
        int ans=0;
        while(n>0){
            if(n>=8){
                n=n-8;
                i++;
                ans+=8*i;
            }else{
                i++;
                ans+=n*i;
                n=0;
            }

        }
            return ans;
    }
}