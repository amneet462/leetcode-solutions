class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0, r = n - 1;
        int k = n - 1; 

        while (l <= r) {
            int left = nums[l] * nums[l];
            int right = nums[r] * nums[r];

            if (left > right) {
                ans[k--] = left;
                l++;
            } else {
                ans[k--] = right;
                r--;
            }
        }
        return ans;
        
    }
}