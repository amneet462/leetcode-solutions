class Solution {
    public void helper(int ind,int target, int[] candidates,List<List<Integer>> ans,List<Integer> ds ){
        int n=candidates.length;
        if(ind==n){
            if(target==0){
            ans.add(new ArrayList<>(ds));
            }
            return;
        }
          if (candidates[ind] <= target) {
            ds.add(candidates[ind]);

           
            helper(ind, target - candidates[ind],
                   candidates, ans, ds);

           
            ds.remove(ds.size() - 1);
        }
       helper(ind+1, target, candidates, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();  // To store the result
        List<Integer> ds = new ArrayList<>();  // To store a current combination
        helper(0, target, candidates, ans, ds);  // Start the recursive search
        return ans; 
    }
}