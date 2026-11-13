class Solution {
     public void helper(ArrayList<String> res, String st, int n, int index) {
        if (st.length() == n) {
            res.add(st);
            return;
        }

        // Always allowed to add '1'
        helper(res, st + "1", n, index + 1);

        // Add '0' only if last char is not '0'
        if (st.isEmpty() || st.charAt(st.length() - 1) != '0') {
            helper(res, st + "0", n, index + 1);
        }
    }   
    public List<String> validStrings(int n) {
        ArrayList<String>res=new ArrayList<>();
        helper(res,"",n,0);
        return res;
    }
}