class Solution {
    public boolean help(int[] nums, int k,int m){
        int part=1;
        int ss=0;
        for(int a:nums){
            if((a+ss)<=m){
                ss+=a;
            }else{
                part++;
                ss=a;
            }
        }
        return part<=k;
    }
    public int splitArray(int[] nums, int k) {
          int l=Arrays.stream(nums).max().getAsInt();
        int r=Arrays.stream(nums).sum();
        while(l<=r){
            int m=(l+r)/2;
            if(help(nums,k,m)){
               r=m-1;
            }else{
               l=m+1; 
            }
        }
        return l;
    }
}