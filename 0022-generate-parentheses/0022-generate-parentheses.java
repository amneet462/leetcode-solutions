class Solution {
    public void helper(ArrayList<String>res, StringBuilder st, int open,int close,int n){
        if((open+close)==2*n){
            res.add(st.toString());
            return;
        }
        if(open<n){
            st.append("(");
            helper(res,st,open+1,close,n);
            st.deleteCharAt(st.length()-1);
        }if(close<open){
            st.append(")");
            helper(res,st,open,close+1,n);
            st.deleteCharAt(st.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String>res=new ArrayList<>();
        StringBuilder st=new StringBuilder();
        helper(res,st,0,0,n);
        return res;
    }
}