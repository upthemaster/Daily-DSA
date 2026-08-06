class Solution {

    public int prodOfDigits(int num) {
        int prod = 1;

        while(num > 0) {
            int digit = num % 10;
            prod = prod * digit;
            num /= 10;
        }
        return prod;
    }

    public int smallestNumber(int n, int t) {
        
        int curr = n;

        while(true) {
            int product = prodOfDigits(curr);

            if(product % t == 0) {
                return curr;
            }
            curr++;
        }

    }
}