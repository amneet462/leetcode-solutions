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
    public boolean helper(TreeNode root, int k,HashSet st ){
        if(root==null)return false;
       
            int comp=k-root.val;
            if(st.contains(comp)){
                return true;
            }
            st.add(root.val);
        
        return helper(root.left,k,st)||helper(root.right,k,st);
    }
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer>st=new HashSet<>();
        return helper(root,k,st);
    }
}