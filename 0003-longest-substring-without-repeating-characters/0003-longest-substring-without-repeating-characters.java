class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int i=0;
        int maxLen = 1;
        int left = 0;
        int right =0;
        HashSet<Character> set = new HashSet<>();

        if (s.length() == 0)
            return 0;

        // for(int j=1;j<s.length();j++){
        //     // maxLen=Math.max(1,maxLen);
        //     int temp=j-1;
        //     while(i<=temp){
        //         if(s.charAt(temp)==s.charAt(j)){
        //             i=temp+1;
        //             break;
        //         }

        //         temp--;
        //     }
        //         maxLen=Math.max(maxLen,j+1-i);

        // }

        for ( right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;

    }
}