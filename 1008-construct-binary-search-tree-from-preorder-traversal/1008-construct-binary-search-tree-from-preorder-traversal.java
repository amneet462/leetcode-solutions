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
    public void insert(TreeNode root, int val){
        TreeNode t=root;
        TreeNode p=null;
        TreeNode nw=new TreeNode(val,null,null);
        while(t!=null){
            if(t.val>val){
                p=t;
                t=t.left;
            }else{
                p=t;
                t=t.right;
            }
            
        }
        if(p.val>val)p.left=nw;
            else p.right=nw;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){return null;}
        TreeNode root=new TreeNode(preorder[0], null,null);
        for(int i=1;i<preorder.length;i++){
            insert(root, preorder[i]);
        }
        return root;
    }
}