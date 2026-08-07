class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        int n=s.length();
        for(int i=0;i<n;i++){

            if(s.charAt(i)==']'){
            StringBuilder sb=new StringBuilder();
                while(stack.peek()!='['){

                sb.insert(0,stack.pop());
                }
                stack.pop();
                int num=0;
                if(stack.isEmpty()) {
                    num=1;
                }
                Stack<Integer> nstack=new Stack<>();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){

                 nstack.push(stack.pop()-'0');
               
                }
                while(!nstack.isEmpty()){
                    num=num*10+nstack.pop();
                }

                for(int k=0;k<num;k++){
                for(int j=0;j<sb.length();j++){
                    stack.push(sb.charAt(j));
                }
                }



            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder res=new StringBuilder();
        while(!stack.isEmpty()){
            res.insert(0, stack.pop()); 
        }
        return res.toString();
    }
}