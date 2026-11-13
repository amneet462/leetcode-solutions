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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root=build(inorder,0,inorder.length-1,preorder,0,preorder.length-1,mp);
        return root;
    }
    public TreeNode build(int[] inorder, int inst,int inend,int [] preorder,int prest,int preend, HashMap<Integer,Integer>mp){
        if(inst>inend|| prest>preend){
            return null;
        }
        TreeNode root=new TreeNode(preorder[prest]);
        int inroot=mp.get(root.val);
        int numsleft=inroot-inst;
        root.left=build(inorder,inst,inroot-1,preorder,prest+1,prest+numsleft,mp);
        root.right=build(inorder,inroot+1,inend,preorder,prest+1+numsleft,preend,mp);
        return root;
    }
}