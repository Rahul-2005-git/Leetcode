class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            

            if(s.charAt(i)=='('){stack.push('(');}
            else if(s.charAt(i)=='{'){stack.push('{');}
            else if(s.charAt(i)=='['){stack.push('[');}
            else if(stack.isEmpty())return false;

            else if(s.charAt(i)==')'){
                if(stack.peek()=='(') stack.pop();
                else return false;
            }
             else if(s.charAt(i)==']'){
                if(stack.peek()=='[') stack.pop();
                else return false;
            }
             else if(s.charAt(i)=='}'){
                if(stack.peek()=='{') stack.pop();
                else return false;
            }
        }

        if(stack.isEmpty())return true;

        return false;
        
    }
}