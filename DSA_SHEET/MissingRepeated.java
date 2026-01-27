import java.util.Arrays;

public class MissingRepeated {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] freq = new int[n * n + 1];

        // Step 1: Count frequency of each number in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeated = -1;
        int missing = -1;

        // Step 2: Find the repeated and missing numbers
        for (int num = 1; num <= n * n; num++) {

            // If frequency is 2, number is repeated
            if (freq[num] == 2) {
                repeated = num;
            }

            // If frequency is 0, number is missing
            if (freq[num] == 0) {
                missing = num;
            }
        }

        // Step 3: Return result
        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3},
            {2, 2}
        };

        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(result));
    }
}
