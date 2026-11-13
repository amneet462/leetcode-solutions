class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int n2=nums2.length;
        int[] nextgre=new int[10001];
        for(int i=n2-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()<=nums2[i]){
                st.pop();
            }
            nextgre[nums2[i]]=st.isEmpty()?-1:st.peek();
            st.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextgre[nums1[i]];
        }

        return nums1;
    }
}