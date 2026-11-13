class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        for(int aster:asteroids){
            boolean alive=true;
            while(!st.isEmpty() && aster<0 && alive && st.peek()>0){
                if(st.peek()<-aster){
                    st.pop();
                }else if(st.peek()==-aster){
                    st.pop();
                    alive=false;
                }else{
                    alive=false;
                }
            }
            if(alive){
                st.push(aster);
            }
        }
         int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;
    }
}