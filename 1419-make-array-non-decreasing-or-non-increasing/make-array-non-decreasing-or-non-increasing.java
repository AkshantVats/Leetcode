class Solution {
    int helper(int[] nums) {
        var que = new PriorityQueue<Integer>();
        var res = 0;
        for(var num : nums) {
            if(!que.isEmpty() && num<(-que.peek())) {
                res += (-que.poll())-num;
                que.offer(-num);
            }
            que.offer(-num);
        }
        return res;
    }
    public int convertArray(int[] nums) {
        var nums2 = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            nums2[nums.length-1-i]=nums[i];
        }
        return Math.min(helper(nums),helper(nums2));
    }
}