class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0;
        int n = nums.length;

        // XOR indices and array elements
        for (int i = 0; i < n; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        // XOR the last number (n)
        xor ^= n;

        return xor;
    }
}