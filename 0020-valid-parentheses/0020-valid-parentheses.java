class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(stack.pop()!='(')return false;
                }
            }
             else if(ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(stack.pop()!='[')return false;
                }
            }
             else if(ch=='}'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    if(stack.pop()!='{')return false;
                }
            }
            else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}