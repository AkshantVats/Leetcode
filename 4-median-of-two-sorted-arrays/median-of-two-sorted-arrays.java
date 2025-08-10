class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length + nums2.length];
        
        int p = 0;
        int q = 0;
        int idx = 0;
        
        while(p < nums1.length || q < nums2.length)
        {
            if(p == nums1.length) { temp[idx++] = nums2[q++]; continue;}
            if(q == nums2.length) { temp[idx++] = nums1[p++]; continue;}
            
            if(nums1[p] < nums2[q])
            {
                temp[idx++] = nums1[p++];
            }
            else
            {
                temp[idx++] = nums2[q++];
            }
        }
        
        
        if(temp.length % 2 == 0)
        {
            return ((double) temp[temp.length/2] + (double) temp[(temp.length/2) - 1]) / 2;
            
        }
        else
        {
            return (double)temp[temp.length/2]; 
        }
    }
}