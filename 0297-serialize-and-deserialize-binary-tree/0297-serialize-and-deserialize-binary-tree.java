/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode p=q.poll();
            if(p==null){
                sb.append("null,");
            }
            else{
                sb.append(p.val+",");
            
            q.offer(p.left);
            q.offer(p.right);}
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()){
            return null;
        }
        String[]st=data.split(",");
        TreeNode root=new TreeNode(Integer.parseInt(st[0]));
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        for(int i=1;i<st.length;i++){
            TreeNode p=q.poll();
             if(!st[i].equals("null")){
                TreeNode left=new TreeNode(Integer.parseInt(st[i]));
                p.left=left;
                q.offer(left);
            }
            if(!st[++i].equals("null")){
        TreeNode right=new TreeNode(Integer.parseInt(st[i]));
        p.right=right;
        q.offer(right);
    }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));