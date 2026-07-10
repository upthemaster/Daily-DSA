class Solution { // Approach : Bezouts Identity    Time : O(nlogm)    Space : O(1)
    public boolean isGoodArray(int[] nums) {
        int gcd = nums[0]; 
        for(int i = 0; i < nums.length; i++){
            int a = gcd;
            int b = nums[i];

            while(b != 0){
                int remainder = a % b;
                a = b;
                b = remainder;
            }
            gcd = a;

            if(gcd == 1){
                return true;
            }
        }
        return gcd == 1;
    }
}