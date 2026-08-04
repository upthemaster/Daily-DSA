import java.util.Arrays;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < nums.length - 1; i++) {
            int left = nums[i];
            int right = nums[i + 1];

            while(left + 1 < right) {
                left++;
                ans.add(left);
            }
        }
        return ans;
    }
}