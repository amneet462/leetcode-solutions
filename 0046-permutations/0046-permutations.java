class Solution {
    public void helper(int[] nums,ArrayList<List<Integer>>res,ArrayList<Integer>ds,boolean[]visited ){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));

            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }
            visited[i]=true;
            ds.add(nums[i]);
            helper(nums,res,ds,visited);
            ds.remove(ds.size()-1);
            visited[i]=false;

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(nums,res,ds,visited);
        return res;
    }
}