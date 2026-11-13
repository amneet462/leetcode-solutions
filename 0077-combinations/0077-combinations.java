class Solution {
    public void helper(int n, int k,List<List<Integer>>res,List<Integer> sol,int start){
        if(sol.size()==k){
            res.add(new ArrayList<>(sol));
            return ;
        }
        for(int i=start;i<=n;i++){
            sol.add(i);
           
             helper(n,k,res,sol,i+1);
             sol.remove(sol.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer> sol=new ArrayList<>();
        helper(n,k,res,sol,1);
        return res;
    }
}