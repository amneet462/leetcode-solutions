class Solution {
    public void swap(int[]nums,int st,int end){
        int temp=nums[st];
        nums[st]=nums[end];
        nums[end]=temp;
    }
    public void rev(int[]nums,int st){
        int end=nums.length-1;
        while(st<end){
            int temp=nums[st];
        nums[st]=nums[end];
        nums[end]=temp;
        st++;end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        if(ind1==-1){
            rev(nums,0);
        }else{
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }
            swap(nums,ind1,ind2);
            rev(nums,ind1+1);
        }
    }
}