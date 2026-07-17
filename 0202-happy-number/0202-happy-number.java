class Solution {
    // Approach : S & F Pointer     Time : O(log n)     Space : O(1)
    private int findSum(int n) {
        int sum = 0;
        while(n > 0) {
            int dig  = n % 10;
            n /= 10;
            sum += dig * dig;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(true) {
            slow = findSum(slow);
            fast = findSum(findSum(fast));

            if(fast == 1)
                return true;

            if(slow == fast)
                return false;
        }
    }
}