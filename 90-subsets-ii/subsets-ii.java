class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(output, new ArrayList<Integer>(), nums, 0);
        return output;
    }

    public void backtrack(List<List<Integer>> output, List<Integer> tempList, int[] nums, int start){
        output.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(output, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}