class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=1;
        int[] res=new int[n];
        for(int val:nums){
            if(val<0){
                res[j]=val;
                j+=2;
            }else{
                res[i]=val;
                i+=2;
            }
        }
        return res;
    }
}