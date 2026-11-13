class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int[] arr=new int[2];
       int l=0;
       int r=numbers.length-1;
       for(int i=0;i<=numbers.length-1;i++){
        if(numbers[l]+numbers[r]==target){
            arr[0]=l+1;
            arr[1]=r+1;
        }else if(numbers[l]+numbers[r]<target){
            l++;
        }else{
            r--;
        }
       } 
       return arr;
    }
}