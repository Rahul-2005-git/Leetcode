class Solution {
    public String digitSum(String s, int k) {
       

       while(s.length()>k){
        StringBuilder sb=new StringBuilder();


int sum=0;
            for(int i=0;i<s.length();i++){
                if(i%k==0 && i!=0)
                {
                    sb.append(sum);
                    sum=0;
                }
                sum+=s.charAt(i)-'0';

            }
             sb.append(sum);

            s=sb.toString();
    //         System.out.println(s);
       }
       

       return s;
    }
}