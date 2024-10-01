class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        int[] arr = new int[26];
        for(String str : strs){
            Arrays.fill(arr, 0);
            for(char c : str.toCharArray()){
                arr[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i < arr.length; i++){
                sb.append("#");
                sb.append(arr[i]);
            }

            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}