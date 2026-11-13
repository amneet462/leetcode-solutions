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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<Pair<TreeNode,Long>>q=new LinkedList<>();
        q.offer(new Pair<>(root,0L));
        long st=0;
        long last=0;
        long ans=0;
        while(!q.isEmpty()){
            int sze=q.size();
            for(int i=0;i<sze;i++){
                Pair<TreeNode,Long>p=q.poll();
            TreeNode node=p.getKey();
           long index=p.getValue();
            if(i==0){
                st=index;
            }
            if(i==sze-1){
                last=index;
            }
            if(node.left!=null){
                q.offer(new Pair<>(node.left,2*index+1));
            }
            if(node.right!=null){
                q.offer(new Pair<>(node.right,2*index+2));
            }
            }
            ans=Math.max(ans,last-st+1);
        }
        return (int)(ans);
    }
}