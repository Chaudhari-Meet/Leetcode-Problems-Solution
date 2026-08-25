class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int result;
        for(int i=0;i<tokens.length;i++){
            String token = tokens[i];
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                switch(token){
                    case "+":
                        stack.push(b+a);
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(b*a);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}