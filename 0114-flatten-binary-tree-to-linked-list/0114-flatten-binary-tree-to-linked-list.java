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
    public void preorder(TreeNode root,List<TreeNode>ans){
        if(root==null)return;
        ans.add(root);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public void flatten(TreeNode root) {
        if(root==null)return;
        List<TreeNode>ans=new ArrayList<>();
        preorder(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            TreeNode curr=ans.get(i);
            curr.left=null;
            curr.right=ans.get(i+1);
        }
    }
}