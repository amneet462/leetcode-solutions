class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
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

        for(int i = 0; i < numCourses; i++) {
            if(indeg[i] == 0) {
                q.offer(i);
            }
        }

        int count = 0;

        while(!q.isEmpty()) {

            int node = q.poll();
            count++;

            for(int neigh : adj.get(node)) {

                indeg[neigh]--;

                if(indeg[neigh] == 0) {
                    q.offer(neigh);
                }
            }
        }

        return count == numCourses;
    }
}