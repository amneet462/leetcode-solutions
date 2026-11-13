class Solution {
    public int trap(int[] height) {
        int left=0;
        int right =height.length-1;
        int sum=0;
        int leftMax=0;
        int rightMax=0;
        while(left<=right){
            if(height[left] <=height[right]){
               
                if(leftMax <= height[left]){
                    leftMax =height[left];
                }
                else{
                    sum+= leftMax-height[left];
                }
                left++;
            }
               
            else{
                 if(rightMax <=height[right]){
                    rightMax =height[right];
                }
                else{
                    sum+=rightMax -height[right];
                }
                right--;
            }
             
        }
        return sum;
    }
}