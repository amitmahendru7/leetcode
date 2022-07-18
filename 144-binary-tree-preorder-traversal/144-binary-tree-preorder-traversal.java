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
    public List<Integer> preorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> output = new ArrayList<>();
        if(root== null)
            return output;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node= stack.pollLast();
            output.add(node.val);
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null)
                stack.add(node.left);
        }
        return output;
    }
}