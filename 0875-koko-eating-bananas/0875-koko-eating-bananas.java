class Solution {
    public boolean sol(int[] piles, int h,int m){
        int sum=0;
        for(int a:piles){
            sum+=(a+m-1)/m;
            if(sum>h)return false;
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int ans=-1;
        int r=Arrays.stream(piles).max().getAsInt();
        while(l<=r){
            int m=(l+r)/2;
            if(sol(piles,h,m)){
                ans=m;
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
}