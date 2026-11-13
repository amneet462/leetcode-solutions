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
    public void helper(TreeNode root, StringBuilder st,List<String> ans){
        if(root==null){
            return;
        }
        int len=st.length();
        if(len!=0)st.append("->");
        st.append(root.val);
        if(root.left==null && root.right==null){
            ans.add(st.toString());
           
        }else{
             helper(root.left, st, ans);
            helper(root.right, st, ans);
        }
        st.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder st=new StringBuilder();
        List<String> ans=new ArrayList<>();
        helper(root,st,ans);
        return ans;
    }
}