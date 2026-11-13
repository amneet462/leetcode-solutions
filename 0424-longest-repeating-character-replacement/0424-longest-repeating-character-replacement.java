class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxcount=0;
        int maxlen=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxcount=Math.max(maxcount,freq[s.charAt(right)-'A']);
            while((right-left+1)-maxcount>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}