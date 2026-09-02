class Solution { // kadane's Algo O(n)
    public int maxSubArray(int[] nums) {
        int bestEnding = nums[0];
        int finalRes = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int val1 = bestEnding + nums[i];
            int val2 = nums[i];

            bestEnding = Math.max(val1, val2);
            finalRes = Math.max(bestEnding, finalRes);
        }

        return finalRes;
    }
}