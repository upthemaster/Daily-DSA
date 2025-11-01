import java.util.*;
public class LargestInArray{
    public static int getLarge(int []nums){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i< nums.length;i++){
            if(largest < nums[i]){
                 largest = nums[i];
            }
            if(smallest > nums[i]){
                smallest = nums[i];
            } 
        }
        System.out.println("The smallest element is: "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int [] nums = {2,4,8,9,6};
        System.out.println("The largest element is: "+getLarge(nums));
    }
}
