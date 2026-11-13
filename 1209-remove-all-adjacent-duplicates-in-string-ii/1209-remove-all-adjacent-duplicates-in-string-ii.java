class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character>charst=new Stack<>();
        Stack<Integer>countst=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!charst.isEmpty() && charst.peek()==ch){
                countst.push(countst.peek()+1);
            }else countst.push(1);
            charst.push(ch);
            if(countst.peek()==k){
                for(int i=0;i<k;i++){
                    charst.pop();
                    countst.pop();
                }
            }
        }
          StringBuilder sb=new StringBuilder();
        while(charst.size()>0) sb.append(charst.pop());
        return sb.reverse().toString();
    }
}