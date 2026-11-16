class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>st=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int maxi=0;
       
        for(int n:st){
            if(!st.contains(n-1)){
                int curr=n;
                int len=1;
                while(st.contains(curr+1)){
                    curr++;
                    len++;
                }
                maxi=Math.max(maxi,len);
            }
        }
        return maxi;
    }
}