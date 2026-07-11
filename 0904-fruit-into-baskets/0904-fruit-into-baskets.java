class Solution { // exact problem like longest substring with k uniques
    //Approach -> Sliding Window Time : O(n) Space : O(1)
    public int totalFruit(int[] fruits) {
        int []freq = new int[1000001];
        int left = 0;
        int distinct = 0;
        int maxLen = -1;

        for(int right = 0; right < fruits.length; right++){
            int in = fruits[right];
            if(freq[in] == 0){
                distinct++;
            }
            freq[in]++;

            while(distinct > 2){
                int out = fruits[left];
                freq[out]--;

                if(freq[out] == 0){
                    distinct--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}