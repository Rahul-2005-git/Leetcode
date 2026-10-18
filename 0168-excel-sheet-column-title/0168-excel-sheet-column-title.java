class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
        StringBuilder sb=new StringBuilder();
     
        while(n>0){
            n--;
            int num=n%26;
            n/=26;
            sb.append((char)('A'+num));

            // if(n>0 && n<=26){
            // sb.append((char)('A'+n-1));
            // }
        }

        return sb.reverse().toString();
    }
}