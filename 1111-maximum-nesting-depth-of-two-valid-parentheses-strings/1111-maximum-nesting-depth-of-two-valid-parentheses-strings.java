class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        
        Stack<Character> stack=new Stack<>();
        int []res=new int[seq.length()];

        int depth=0;
        int i=0;

        for(char ch:seq.toCharArray()){
           
            if(ch=='('){
                // stack.push(ch);
                 res[i]=depth%2;
                depth++;
            }
            else if(ch==')'){
                // stack.pop();
                depth--;
                 res[i]=depth%2;
            }
            else{
                 res[i]=depth%2;
            }
            i++;
        }
        return res;
    }
}