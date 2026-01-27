public class SingleNumber {
    // The problem want a result ad non-duplicated number from the array
    public static int singleNum(int []nums) {
        int ans = 0;
        for(int num : nums){
            // Here we do binary operations like addition 
            ans = ans ^ num; // we used XOR gate logic to cancel same values 

        }
        return ans; // non-dupicate value get returned

    }
    public static void main(String[] args) {
        int [] nums = {2,4,5,3,2,4,5,7,3};
        System.out.println(singleNum(nums));
    }
  
}
