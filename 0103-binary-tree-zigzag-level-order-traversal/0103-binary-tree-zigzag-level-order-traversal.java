class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) { 
            return res; 
        }
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int num = 0;
        while (!q.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            int x = q.size();
            for (int i = 1; i <= x; i++) {
                TreeNode temp = q.poll(); 
                curLevel.add(temp.val);
                if (temp.left != null) { 
                    q.offer(temp.left); 
                }
                if (temp.right != null) { 
                    q.offer(temp.right); 
                }
            }
            if (num % 2 != 0) {
                Collections.reverse(curLevel);
            }
            res.add(curLevel);
            num++;
        }
        return res;
    }
}
