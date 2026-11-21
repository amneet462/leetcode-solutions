class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            avg=sum/k;
        }
        double maxavg=avg;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];
            avg=sum/k;
            maxavg=Math.max(maxavg,avg);
        }
        return maxavg;
    }
}