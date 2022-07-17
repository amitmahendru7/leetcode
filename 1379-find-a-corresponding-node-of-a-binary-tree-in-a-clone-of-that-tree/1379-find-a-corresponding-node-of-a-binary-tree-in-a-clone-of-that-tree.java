/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans, target;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target=target;
        inOrder(original,cloned);
        return ans;
    }
    
    public void inOrder(TreeNode orig, TreeNode cl){
        if(orig !=null){
            inOrder(orig.left,cl.left);
            if(orig == target){
                ans = cl;
            }
            inOrder(orig.right,cl.right);
        }
    }
}