import java.util.Arrays;
//0s,1s & 2s

public class ColourSorting {

    // Made method static so it can be called from main
    public static void sortColors(int[] nums) {

        // low pointer -> boundary for placing 0s (red)
        int low = 0;

        // mid pointer -> current element under inspection
        int mid = 0;

        // high pointer -> boundary for placing 2s (blue)
        int high = nums.length - 1;

        // traverse the input array until mid crosses high
        while (mid <= high) {

            // if current element is 0 (red)
            if (nums[mid] == 0) {

                // swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                // move both pointers forward
                low++;
                mid++;
            }

            // if current element is 1 (white)
            else if (nums[mid] == 1) {
                // already in correct middle position
                mid++;
            }

            // if current element is 2 (blue)
            else {

                // swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                // move high pointer backward
                // mid is not incremented here
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};

        // call the sorting method
        sortColors(nums);

        // print the sorted array
        System.out.println(Arrays.toString(nums));
    }
}
