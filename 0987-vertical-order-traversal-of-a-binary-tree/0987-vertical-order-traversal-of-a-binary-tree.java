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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>mp=new TreeMap<>();
        dfs(root,0,0,mp);
         List<List<Integer>>ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>ys:mp.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer>nodes:ys.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
    public void dfs(TreeNode root,int x,int y,TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>mp){
        if(root==null){
            return;
        }
        mp.computeIfAbsent(x,k->new TreeMap<>()).computeIfAbsent(y,k->new PriorityQueue<>());
        mp.get(x).get(y).offer(root.val);
        dfs(root.left,x-1,y+1,mp);
        dfs(root.right,x+1,y+1,mp);
    }
}