class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(current);
            } else if (stack.peek() == current) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        while (!stack.isEmpty()) {
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}