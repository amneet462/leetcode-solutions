class Solution {
    public void subset(List<List<Integer>> ans,List<Integer>ds,int[]nums ,int index){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            subset(ans,ds,nums,i+1);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {

      Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        subset(ans,ds,nums,0);
        return ans;
    }
}