class Solution {
    public String removeOuterParentheses(String s) {
        
        Stack<Character> stack=new Stack<>();
        StringBuilder res=new StringBuilder();

        for(int ch:s.toCharArray()){
            if(ch=='('){
                if(!stack.isEmpty()){
                    res.append('(');
                }
                stack.push('(');
            }
            else{
                if(stack.size()!=1){
                    res.append(')');
                }
                stack.pop();
            }
        }

        return res.toString();
    }
}