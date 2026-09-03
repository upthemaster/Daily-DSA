class Solution { // Kadane + DP
    public int maximumSum(int[] arr) {
        int noDelete = arr[0];

        int oneDelete = Integer.MIN_VALUE;

        int finalAns = arr[0];

        for(int i = 1; i < arr.length; i++) {

            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            //check for no deletion
            noDelete = Math.max(arr[i], prevNoDelete + arr[i]);

            // check for one deletion
            oneDelete = Math.max(prevNoDelete, 
            prevOneDelete == Integer.MIN_VALUE ? Integer.MIN_VALUE : prevOneDelete + arr[i]);

            finalAns = Math.max(finalAns, Math.max(noDelete, oneDelete));
        }
        return finalAns;
    }
}