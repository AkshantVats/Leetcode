class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] start = new int[n];
        int[] end = new int[n];

        for(int i = 0; i < n; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int[] ans = new int[people.length];

        for(int i = 0; i < people.length; i++) {
            // very first flower blooms after person time people[i]
            int x = binarySearch(start, people[i] + 1); 

            // last flower blooms 
            int y = binarySearch(end, people[i]);
            ans[i] = x - y;
        }

        return ans;
    }

    int binarySearch(int[] arr, int target) {
        int ans = arr.length;

        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi) {
            int mid = (lo + hi) / 2;

            if(arr[mid] >= target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return ans;
    }
}