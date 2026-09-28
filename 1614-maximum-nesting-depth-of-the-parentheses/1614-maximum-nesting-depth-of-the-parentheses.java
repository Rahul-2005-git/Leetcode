class Solution {
    public int maxDepth(String s) {
        int max=0;
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                 max=Math.max(stack.size(),max);
            }else if(ch==')'){
                stack.pop();
            }
           
        }
        return max;
    }
}