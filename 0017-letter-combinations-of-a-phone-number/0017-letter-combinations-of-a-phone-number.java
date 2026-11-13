class Solution {
    public void helper(String digits, List<String> res,StringBuilder st,String[] mapping,int index) {
        if (digits.length()==index) {
            res.add(st.toString());
            return;
        }
        String letters=mapping[digits.charAt(index)-'0'];
        for (int i = 0; i <letters.length(); i++) {
            st.append(letters.charAt(i));
            helper(digits,  res, st,mapping,index+1); 
            st.deleteCharAt(st.length() - 1);    // backtrack
        }
    }
    public List<String> letterCombinations(String digits) {
     List<String> res = new ArrayList<>();
     StringBuilder st=new StringBuilder();
      String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };
    helper(digits,  res, st,mapping,0);
    return res;
    }
}