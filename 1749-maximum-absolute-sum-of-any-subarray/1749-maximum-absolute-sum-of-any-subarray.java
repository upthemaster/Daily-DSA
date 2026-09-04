class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxEnding = nums[0];
        int bestMaxEnding = nums[0];

        int minEnding = nums[0];
        int bestMinEnding = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            maxEnding = Math.max(x, maxEnding + x);
            bestMaxEnding = Math.max(bestMaxEnding, maxEnding);

            minEnding = Math.min(x, minEnding + x);
            bestMinEnding = Math.min(bestMinEnding, minEnding);
        }

        return Math.max(Math.abs(bestMaxEnding), Math.abs(bestMinEnding));
    }
}