class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length=0;
        int maxlength=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==1){
               
                length++;
                 maxlength=Math.max(maxlength,length);
            }else{
                length=0;
            }
           
        }
        return maxlength;
    }
}