import java.util.*;

class Solution {
    public void helper(int[] candidates, int target, List<List<Integer>> res, 
                       List<Integer> ds, int index) {
        if (target == 0) {
            res.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) continue;

            // Prune: if candidate > target, no need to continue
            if (candidates[i] > target) break;

            ds.add(candidates[i]);
            helper(candidates, target - candidates[i], res, ds, i + 1); // move to next index
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); // sort to handle duplicates
        List<List<Integer>> res = new ArrayList<>();
        helper(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }


}
