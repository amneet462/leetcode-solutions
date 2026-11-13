class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int maxlen=0;
        int right=0;
        int count0=0;
        while(right<nums.length){
            if(nums[right]==0){
                count0++;
            }
            if(count0>k){
                if(nums[left]==0){
                    count0--;
                }
                left++;
            }
            if(count0<=k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}