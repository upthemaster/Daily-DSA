class Solution {

    // Returns the sum of squares of digits
    private int fun(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        while (true) {

            // Slow moves one step
            slow = fun(slow);

            // Fast moves two steps
            fast = fun(fun(fast));

            // Happy number found
            if (fast == 1) {
                return true;
            }

            // Cycle detected (not happy)
            if (slow == fast) {
                return false;
            }
        }
    }
}