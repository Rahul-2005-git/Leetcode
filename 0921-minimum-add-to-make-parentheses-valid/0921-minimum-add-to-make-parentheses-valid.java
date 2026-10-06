class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push('(');
                // count++;
            }
            else if(!stack.isEmpty() && ch==')'){
                stack.pop();
                // count--;
            }
            else{
                count++;
            }
        }

        count=count+stack.size();
        if(count<0) return -count;
        return count;
    }
}