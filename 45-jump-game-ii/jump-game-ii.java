class Solution {
    public int jump(int[] nums) {
        int answer = 0;
        int n = nums.length;
        int currEnd = 0; 
        int currFar = 0;

        for(int i = 0; i < n-1; i++){
            currFar = Math.max(currFar, i + nums[i]);

            if(i == currEnd){
                answer++;
                currEnd = currFar;
            }
        } 
        return answer;
    }
}