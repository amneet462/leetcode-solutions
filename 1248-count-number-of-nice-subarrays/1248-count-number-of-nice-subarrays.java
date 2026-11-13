class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res=0;
        int odd=0;
        Map<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        for(int i:nums){
            if(i%2!=0)odd++;
            res+=mp.getOrDefault(odd-k,0);
            mp.put(odd,mp.getOrDefault(odd,0)+1);
        }
        return res;
    }
}