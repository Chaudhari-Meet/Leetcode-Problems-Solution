class MinStack {
    List<int[]> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        int[] top = stack.isEmpty() ? new int[]{val, val} : stack.get(stack.size() - 1);
        int min_val = top[1];
        if (min_val > val) {
            min_val = val;
        }
        stack.add(new int[]{val, min_val});        
    }
    
    public void pop() {
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        return stack.isEmpty() ? -1 : stack.get(stack.size() - 1)[0];
    }
    
    public int getMin() {
        return stack.isEmpty() ? -1 : stack.get(stack.size() - 1)[1];
    }
}