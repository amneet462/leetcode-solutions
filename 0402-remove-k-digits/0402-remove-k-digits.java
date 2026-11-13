class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty() && k>0 && st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        for(char ch:st){
            ans.append(ch);
        }
        int i = 0;
        while(i<ans.length() && ans.charAt(i)=='0'){
               i++;
            }
        String ansfi=ans.substring(i);
        if(ansfi.isEmpty()){
            return "0";
        }
        return ansfi;
    }
}