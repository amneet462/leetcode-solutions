class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
          ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i <  numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indeg = new int[ numCourses];

        for(int[] edge :prerequisites) {
            int u = edge[1];
            int v = edge[0];

            adj.get(u).add(v);
            indeg[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int []ans=new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(indeg[i] == 0) {
                q.offer(i);
            }
        }
        int j=0;
        while(!q.isEmpty()) {

            int node = q.poll();
            ans[j++]=node;

            for(int neigh : adj.get(node)) {

                indeg[neigh]--;

                if(indeg[neigh] == 0) {
                    q.offer(neigh);
                }
            }
        }
        if (j != numCourses) {
    return new int[0];
}

        return ans;
    }
}