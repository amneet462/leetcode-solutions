class Solution {
    public boolean isspossible(int[] bloomDay, int mid, int k, int m){
        int count=0;
        int boug=0;
        for(int i=0;i<bloomDay.length;i++){
            if(mid>=bloomDay[i]){
                count++;
                if(count==k){
                    boug++;
                    count=0;
                }
                
            }else{
                count=0;
            }
        }
        return boug>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=Arrays.stream(bloomDay).min().getAsInt();
        int r=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            
            if(isspossible(bloomDay,mid,k,m)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;

    }
}