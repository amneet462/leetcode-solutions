class Solution {

    public void helper(int ind, int k, int n,
                       List<List<Integer>> ans, List<Integer> ds) {

        // Exactly k numbers selected
        if (ds.size() == k) {
            if (n == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        for (int i = ind; i <= 9; i++) {

            // If current number is greater than remaining sum
            if (i > n) {
                break;
            }

            // Pick
            ds.add(i);

            // Move to i + 1 because number can be used only once
            helper(i + 1, k, n - i, ans, ds);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        helper(1, k, n, ans, ds);

        return ans;
    }
}