class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            char incoming = s.charAt(right);
            map.put(incoming, map.getOrDefault(incoming, 0) + 1);

            while(map.get(incoming) > 1) {
                char outgoing = s.charAt(left);
                map.put(outgoing, map.getOrDefault(outgoing, 0) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}