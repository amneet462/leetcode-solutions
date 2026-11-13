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
    public int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public boolean checkcomplete(TreeNode root,int idx, int total){
        if(root==null){
            return true;
        }
        if(idx>=total){
            return false;
        }
        return checkcomplete(root.left,2*idx+1,total) && checkcomplete(root.right,2*idx+2,total);
    }
    public boolean isCompleteTree(TreeNode root) {
        int total=countNodes(root);
        return checkcomplete(root,0,total);
    }
}