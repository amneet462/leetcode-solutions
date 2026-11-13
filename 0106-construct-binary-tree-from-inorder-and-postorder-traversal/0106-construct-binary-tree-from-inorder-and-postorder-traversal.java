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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root=build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
        return root;
    }
     public TreeNode build(int[] inorder, int inst,int inend,int [] postorder,int prost,int proend, HashMap<Integer,Integer>mp){
        if(inst>inend|| prost>proend){
            return null;
        }
        TreeNode root=new TreeNode(postorder[proend]);
        int inroot=mp.get(root.val);
        int numsleft=inroot-inst;
        root.left=build(inorder,inst,inroot-1,postorder,prost,prost+numsleft-1,mp);
        root.right=build(inorder,inroot+1,inend,postorder,prost+numsleft,proend-1,mp);
        return root;
    }
}