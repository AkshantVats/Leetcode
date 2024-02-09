class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int start = 0;
        int end = n;
        int maxSum = 0;
        int sum = 0;
        while(start < end){
            sum = (end - start) * Math.min(height[start], height[end]);
            maxSum = Math.max(maxSum, sum);
            if(height[start] <= height[end]){
                start++;
            }else{
                end--;
            }
        }
        return maxSum;
    }
}