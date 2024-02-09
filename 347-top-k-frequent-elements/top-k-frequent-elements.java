class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        PriorityQueue<Integer> frequentHeap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        
        for(int key : map.keySet()){
            frequentHeap.offer(key);
            if (frequentHeap.size() > k) frequentHeap.poll();
        }


        int[] output = new int[k];
        for(int i = k-1; i >= 0 ; i--){
            output[i] = frequentHeap.poll();
        }
        return output;
    }
}