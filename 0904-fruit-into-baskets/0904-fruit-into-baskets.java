class Solution { // exact problem like longest substring with k uniques
    //Approach -> Sliding Window Time : O(n) Space : O(1)
    public int totalFruit(int[] fruits) {
        int[] frequency = new int[1000001]; // Hashmap should better approach
        int left = 0;
        int distinct = 0;
        int maxLength = -1;

        for (int right = 0; right < fruits.length; right++) {

            int incoming = fruits[right];
            
            if (frequency[incoming] == 0) {
                distinct++;
            }
            frequency[incoming]++;

            while (distinct > 2) {
                int outgoing = fruits[left];
                frequency[outgoing]--;

                if (frequency[outgoing] == 0) {
                    distinct--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;       
    }
}