class Solution {
    
        public boolean iscap(int[] weights, int cap, int days) {
        int load = 0;
        int day = 1; // start with day 1
        for (int w : weights) {
            if (load + w > cap) {
                day++;
                load = 0;
            }
            load += w;
        }
        return day <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=Arrays.stream(weights).max().getAsInt();
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        int r=sum;
        while(l<=r){
            int m=(l+r)/2;
            if(iscap(weights,m,days)){
                r=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}