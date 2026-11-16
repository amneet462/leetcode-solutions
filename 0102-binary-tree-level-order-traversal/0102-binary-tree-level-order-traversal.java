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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        List<List<Integer>>ans=new ArrayList<>();
        if (root == null)
            return ans;
        while(!q.isEmpty()){
            List<Integer>sol=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                  TreeNode ele=q.poll();
                         sol.add(ele.val);
            if(ele.left!=null){
                q.add(ele.left);
            }if(ele.right!=null){
                q.add(ele.right);
            }
            }
            ans.add(sol);
        }
        return ans;
    }
}