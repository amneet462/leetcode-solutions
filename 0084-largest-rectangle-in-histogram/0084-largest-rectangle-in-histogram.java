class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();

        // Previous Smaller Element (PSE)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] > heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        // Next Smaller Element (NSE)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        } 
        int area=0;
        int maxarea=0;
        for(int i=0;i<heights.length;i++){
            area=heights[i]*(nse[i]-pse[i]-1);
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}