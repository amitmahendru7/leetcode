class MyQueue {
    private Deque<Integer> stack1;
    private Deque<Integer> stack2;
    private int front;
    public MyQueue() {
        this.stack1= new ArrayDeque<Integer>();
        this.stack2= new ArrayDeque<Integer>();
    }
    
    public void push(int x) {
        if(stack1.isEmpty())
            front=x;
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        stack2.push(x);
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
    }
    
    public int pop() {
        int popped = stack1.pop();
        if(!stack1.isEmpty())
            front= stack1.peek();
        return popped;
    }
    
    public int peek() {
        return front;
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
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