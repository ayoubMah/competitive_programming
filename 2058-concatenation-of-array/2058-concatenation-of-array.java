class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int m = 2*n ;
        
        int[] nums2 = new int[m] ; 
        for(int i = 0 ; i < n ; i++){
            nums2[i] = nums[i] ;
            nums2[i+n] = nums[i] ;
        }
        
        return nums2 ;
        
    }
}