class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int currDay = 0; currDay < n; currDay++){
            int currTemp = temperatures[currDay];

            while(!stack.isEmpty() && temperatures[stack.peek()] < currTemp){
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
            }
            stack.push(currDay);
        }

        return answer;
    }
}