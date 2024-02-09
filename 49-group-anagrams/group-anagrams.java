class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> output = new ArrayList<>();

        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newK = new String(arr);
            if(map.containsKey(newK)){
                map.get(newK).add(s);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(newK, list);
            }
        }
        output.addAll(map.values());
        return output;
    }
}