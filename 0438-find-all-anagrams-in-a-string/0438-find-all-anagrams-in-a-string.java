class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        if(p.length()>s.length())return ans;
        int []count1=new int[26];
        int[] count2=new int[26];
        int s1=s.length();
        int s2=p.length();
        for(int i=0;i<s2;i++){
            count1[s.charAt(i)-'a']++;
            count2[p.charAt(i)-'a']++;

        }
        if(Arrays.equals(count1,count2))ans.add(0);
        for(int i=s2;i<s1;i++){
            count1[s.charAt(i)-'a']++;
            count1[s.charAt(i-s2)-'a']--;
            if(Arrays.equals(count1,count2))ans.add(i-s2+1);
        }
        return ans;
    }
}