class MyQueue {

    Stack<Integer> stack;
    Stack<Integer> rev;

    public MyQueue() {
         stack =new Stack<>();
         rev=new Stack<>();

    }
    
    public void push(int x) {
        stack.push(x);
        
        
    }
    
    public int pop() {
        while(!stack.isEmpty()){
        rev.push(stack.pop());

        }
        int temp=rev.pop();
        while(!rev.isEmpty()){
            stack.push(rev.pop());
        }
        return temp;
        
    }
    
    public int peek() {
         while(!stack.isEmpty()){
        rev.push(stack.pop());

        }
        int temp=rev.peek();
        while(!rev.isEmpty()){
            stack.push(rev.pop());
        }
        return temp;
        
    }
    
    public boolean empty() {
        return stack.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */