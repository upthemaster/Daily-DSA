import java.util.Arrays;

class Solution { // Sorting + Math , but time is O(nlogn) due to sorting
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int prod1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int prod2 = nums[0] * nums[1] * nums[ n - 1];

        int max = Math.max(prod1, prod2);
        return max;
    }
}