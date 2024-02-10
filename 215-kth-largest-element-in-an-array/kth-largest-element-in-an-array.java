class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            minHeap.offer(nums[i]);
            if(i >= k){
                minHeap.poll();
            }
        }
        return minHeap.poll();
    }
}