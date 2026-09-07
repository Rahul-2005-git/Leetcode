class Solution {
    public String addStrings(String num1, String num2) {
        
        int l1=num1.length();
        int l2=num2.length();
        int n1=0;
        int n2=0;
        StringBuilder res=new StringBuilder();

        int diff=0;
        int m;
        int carry=0;
        if(l1>l2){
            diff=l1-l2;
            m=1;
        }
        else{
            diff=l2-l1;
            m=2;
        }

        if(m==1){

        for(int i=l2-1;i>=0;i--){
            int temp=num1.charAt(i+diff)-'0'+num2.charAt(i)-'0' ;

            temp+=carry;
            int t=temp%10;


            carry=temp/10;
            res.insert(0,t); 
            // System.out.println(temp);
            
        }
        for(int i=l1-l2-1;i>=0;i--){
                int temp=num1.charAt(i)-'0';
                temp+=carry;
                // System.out.println(temp);

        res.insert(0,temp%10);
        carry=temp/10;
        }

        }
        if(m==2){

        for(int i=l1-1;i>=0;i--){
            int temp=num2.charAt(i+diff)-'0'+num1.charAt(i)-'0';
            temp+=carry;
            int t=temp%10;


            carry=temp/10;
            res.insert(0,t); 
            // System.out.println(temp);
        }
        for(int i=l2-l1-1;i>=0;i--){
 int temp=num2.charAt(i)-'0';
                temp+=carry;
                // System.out.println(temp);

        res.insert(0,temp%10);
        carry=temp/10;
        }

        }
        if(carry==1)
        res.insert(0,carry);

        return res.toString();
    }
}