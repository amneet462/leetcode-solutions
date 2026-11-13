class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st=new Stack<>();
        int i=0;
        int j=0;
        for(int val:pushed){
            pushed[i++]=val;
            while(i>0&& pushed[i-1]==popped[j]){
                i--;
                j++;
            }
            
        }
        return i==0;
    }
}