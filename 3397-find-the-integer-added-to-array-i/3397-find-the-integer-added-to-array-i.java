class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        // i'll sorted the 2 nums
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // [2,4,6] [5,7,9]
        int result = nums2[0] - nums1[0] ;

        return result ;
    }
}