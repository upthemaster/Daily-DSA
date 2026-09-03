class Solution {
    public boolean uniformArray(int[] nums1) {
        int sOdd = Integer.MAX_VALUE;

        for(int num : nums1) {
            if(num % 2 == 1) {
                sOdd = Math.min(sOdd, num);
            }
        }

        if(sOdd == Integer.MAX_VALUE) {
            return true;
        }

        for(int num : nums1) {
            if(num % 2 == 0 && num <= sOdd) {
                return false;
            }
        }
        return true;
    }
}