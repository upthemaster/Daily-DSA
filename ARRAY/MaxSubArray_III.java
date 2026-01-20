// Kadane's Algorithm -> Most IMP

public class MaxSubArray_III {
    public static void kadanes(int []nums){
        int msum = Integer.MIN_VALUE; // msum is initialized to the -ve infinity.
        int currSum = 0;

        // this for loop is used to calculate currSum
        for(int i=0; i<nums.length; i++){
            currSum += nums[i];
            msum = Math.max(currSum, msum); // Math function is used to retrive maxSum from both elements

            if(currSum < 0){
                currSum = 0; // while currSum get -ve value, it will set to zero.
            }
            
        }
        System.out.println("Max Subarray Sum : " + msum);
    }
    public static void main(String[] args) {
        int []nums = {-2,-3,4,-1,-2,-1,-5,3};
        kadanes(nums);
    }
    
}
