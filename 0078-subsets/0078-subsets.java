class Solution {
    public void subset(List<List<Integer>> ans,List<Integer>ds,int[]nums ,int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        ds.add(nums[index]);//pick
        subset(ans,ds,nums,index+1);
        ds.remove(ds.size()-1);
       subset(ans,ds,nums,index+1);//other pick
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        subset(ans,ds,nums,0);
        return ans;
    }
}