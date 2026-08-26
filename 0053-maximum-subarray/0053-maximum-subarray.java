class Solution { // kadane's Algo O(n)
    public int maxSubArray(int[] nums) {
        int bestEnding = nums[0];
        int finalAns = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int val1 = bestEnding + nums[i];
            int val2 = nums[i];

            bestEnding = Math.max(val1, val2);
            finalAns = Math.max(finalAns, bestEnding);
        }
        return finalAns;
    }
}