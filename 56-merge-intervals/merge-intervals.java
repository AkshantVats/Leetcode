class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 0){
            return intervals;
        }

        Arrays.sort(intervals, (i1,i2)-> Integer.compare(i1[0], i2[0]));

        LinkedList<int[]> result = new LinkedList<>();
        for(int[] interval : intervals){
            if(result.isEmpty() || result.getLast()[1] < interval[0]){
                result.add(interval);
            }else{
                result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
     }
}