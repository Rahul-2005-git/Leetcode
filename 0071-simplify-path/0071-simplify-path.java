class Solution {
    public String simplifyPath(String path) {
        
        String[] subPaths =path.split("/");

        Stack<String> stack =new Stack<>();
        Stack<String> rev=new Stack<>();
        for(String str:subPaths){
        System.out.println( str);
            if(str.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!str.equals(".") && !str.isEmpty() && !str.equals("..")){
                stack.push(str);
            }
        }

        if (stack.isEmpty()) {
                return "/";
            }           
            int len=1;
            while(!stack.isEmpty()){
                rev.push(stack.pop());
                len++;
            }
            String[] res=new String[len];
            int i=1;
            res[0]="";
            while(!rev.isEmpty()){
                res[i]=rev.pop();
                i++;
            }
            
            return String.join("/",res);
    }
}