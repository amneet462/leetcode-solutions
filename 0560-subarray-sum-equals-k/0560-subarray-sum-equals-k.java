import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int prefixSum = 0;

        // HashMap to store prefix sums and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: sum=0 occurs once
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-k)){
                count+=map.get(prefixSum-k);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }
}
