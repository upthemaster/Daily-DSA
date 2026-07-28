class Solution {
    public String smallestPalindrome(String s) {
        
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder leftH = new StringBuilder();
        String mid = "";

        for(int i = 0; i < 26; i++) {
            int count = freq[i] / 2;

            while(count-- > 0) {
                leftH.append((char)('a' + i));
            }

            if(freq[i] % 2 == 1) {
                mid = String.valueOf((char)('a' + i));
            }
        }
        String rightH = new StringBuilder(leftH).reverse().toString();
        return leftH.toString() + mid + rightH;
    }
}