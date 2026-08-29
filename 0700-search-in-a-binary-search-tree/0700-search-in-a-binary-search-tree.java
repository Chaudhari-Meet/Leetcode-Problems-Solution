/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode result;
    private TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }

    public void preOrder(TreeNode root, int k) {
        if (root != null) {
            result = insertIntoBST(result, root.val);
            preOrder(root.left, k);
            preOrder(root.right, k);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        if(root!=null){
            if(root.val == val){
                preOrder(root,val);
                return result;
            }else if (val < root.val){
                return searchBST(root.left,val);
            }else{
                return searchBST(root.right,val);
            }
        }
        return null;
    }
}