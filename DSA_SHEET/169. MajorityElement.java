// Finding majority element in the array

public class MajorityElement{
    // Approach -> Boyer Moore Voting Algorithm
    public static int majorityElement(int []nums){
        int candidate = 0; // stores current majority element
        int count = 0; // stores vote count for current candidate

        for(int num : nums){ // here, num is iterator who traverse the nums[] array

            if(count == 0){ // if count becomes zero ,means the vote count of previous candidate is fully cancelled
                candidate = num; // assign current num as new candidate
            }

            if(num == candidate){ // if current num equal to candidate 
                count++; // then increase vote count for cuurent candidate

            }
            else{// this step happens when the new candidate gains vote , then that candidate oppose the candidate who already ganed the vote count

                count--; // decrease the vote count for candidate
            }
        }
        return candidate; // candidate holds the majority element
    }
    public static void main(String[] args) {
        int []nums = {3,2,3,3,2,1,1,1};
        System.out.println(majorityElement(nums));
    }
}
