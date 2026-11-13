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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode>q=new LinkedList<>();
        boolean ltor=true;
        q.add(root);
        while(!q.isEmpty()){
            int sze=q.size();
            List<Integer>res=new ArrayList<>();
            for(int i=0;i<sze;i++){
            TreeNode node=q.poll();
            res.add(node.val);
            if(node.left!=null){
                q.add(node.left);
            }
            if(node.right!=null){
                q.add(node.right);
            }
            }
            if(!ltor){
                Collections.reverse(res);
            }
            ans.add(res);
            ltor=!ltor;
        }
        return ans;
    }
}