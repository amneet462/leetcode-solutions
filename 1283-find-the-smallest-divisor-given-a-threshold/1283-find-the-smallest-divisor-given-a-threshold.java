class Solution {
    public boolean isspossible(int[] nums, int mid, int threshold){
        int res=0;
        for(int i:nums){
            res+=Math.ceil(i/(double)mid);
        }
        return res<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(l<=r){
            int m=(l+r)/2;
            if(isspossible(nums,m,threshold)){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}