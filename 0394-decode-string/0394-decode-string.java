class Solution {
    public String decodeString(String s) {
        Stack<Integer>countst=new Stack<>();
        Stack<StringBuilder> charst=new Stack<>();
        int num=0;
        StringBuilder curr=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch=='['){
                countst.push(num);
                charst.push(curr);
                num=0;
                curr=new StringBuilder();
            }else if(ch==']'){
                int repeat=countst.pop();
                StringBuilder prev=charst.pop();
                for(int i=1;i<=repeat;i++){
                    prev.append(curr);
                }
                curr=prev;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}