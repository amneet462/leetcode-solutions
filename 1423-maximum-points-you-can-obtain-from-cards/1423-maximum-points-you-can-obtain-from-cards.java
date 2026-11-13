class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int sum=0;
        for(int i:cardPoints){
            sum+=i;
        }
        int n=cardPoints.length;
        int windowSize = n - k;
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minSum = windowSum;
        for (int i = windowSize; i < n; i++) {
            windowSum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, windowSum);
        }

        return sum - minSum;
        
    }
}