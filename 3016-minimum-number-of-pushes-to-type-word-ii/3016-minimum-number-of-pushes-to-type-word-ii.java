class Solution {
    public int minimumPushes(String word) {

        int [] freq=new int[26];
       
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;;
        }

        
        Arrays.sort(freq);
       
        int ans=0;
        int push=1;
        int count=0;
        for(int i=25;i>=0;i--){
            // if(i>17){
            //     ans+=freq[i]*1;
            // }else if(i>9){
            //     ans+=freq[i]*2;
            // }
            // else if(i>1){
            //     ans+=freq[i]*3;
            // }
            // else{
            //     ans+=freq[i]*4;
            // }
            if(freq[i]==0)break;
        count++;
        ans+=freq[i]*push;
        if(count==8){
            push++;
            count=0;
        }
        }
        return ans;
    }
}