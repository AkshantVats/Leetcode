class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int length = nums.length-1;
        int[] left = new int[length+1];
        int[] right = new int[length+1];

        left[0] = 1;
        for(int i = 0; i < length; i++){
            left[i+1] = nums[i] * left[i];
        }

        right[length] = 1;
        for(int i = length; i > 0; i--){
            right[i-1] = right[i] * nums[i];
        }

        for(int i = 0; i <= length; i++){
            left[i] = left[i] * right[i];
        }

        return left;
    }
}