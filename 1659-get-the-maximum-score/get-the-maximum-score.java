class Solution {
        int MOD =  1_000_000_007;

    public int maxSum(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        long sum1 = 0, sum2 = 0;
        int i = 0, j = 0;
        while (i < len1 || j < len2) {
            if (i < len1 && (j == len2 || nums1[i] < nums2[j])) {
                sum1 += nums1[i++];
            } else if (j < len2 && (i == len1 || nums1[i] > nums2[j])) {
                sum2 += nums2[j++];
            } else {
                sum2 = Math.max(sum1, sum2) + nums1[i];
                sum1 = sum2;
                i++;
                j++;
            }
        }
        return (int) (Math.max(sum1, sum2) % MOD);
    }
}