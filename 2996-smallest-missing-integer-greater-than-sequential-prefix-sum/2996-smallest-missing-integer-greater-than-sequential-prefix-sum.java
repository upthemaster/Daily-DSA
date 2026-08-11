import java.util.*;

class Solution {
    public int missingInteger(int[] nums) {

        Set<Integer> set = new HashSet<>();

        // Store all elements
        for (int num : nums) {
            set.add(num);
        }

        // Find sum of longest sequential prefix
        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Find smallest missing integer >= sum
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}