public class LinearSearch {
    public static int liSearch (int []nums, int key) {
        
        for(int i=0; i<nums.length;i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String [] args){
        int []nums ={2,4,6,8,10,14,16};
        int index = liSearch(nums, 10);
        if(index == -1){
            System.out.println("Key not FOUND");
        }
        else{
            System.out.println("Key Found at index: "+index);

        }
    }
    
}
