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
            if(i > 0 && nums[i] == nums[i-1] && !visited[i-1]){
                   continue;
            }
            visited[i]=true;
            ds.add(nums[i]);
            helper(nums,res,ds,visited);
            ds.remove(ds.size()-1);
            visited[i]=false;

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        helper(nums,res,ds,visited);
        return res;
    }
}