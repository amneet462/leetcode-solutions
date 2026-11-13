class Solution {
    public boolean dfs(int[][]graph,int[]color,int node){
       for(int neighbour:graph[node]){
        if(color[neighbour]==-1){
            color[neighbour]=1-color[node];
             if (!dfs(graph, color, neighbour)) {
                    return false;
                }
        }
        else if(color[neighbour]==color[node]){
            return false;
        }
       }
       return true;
        
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
           if (color[i] == -1) {

                color[i] = 0; // starting color

                if (!dfs(graph, color, i)) {
                    return false;
                }
            }
           
        }
        return true;
    }
}