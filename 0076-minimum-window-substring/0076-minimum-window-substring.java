class Solution {

    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        int []freq = new int [128];
        for(char ch: t.toCharArray()){
            freq[ch]++;
        }

        int left = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++){
            char incoming = s.charAt(right);
            if(freq[incoming] > 0){
                required--;
            }
            freq[incoming]--;
            
            while(required == 0){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char out = s.charAt(left);
                freq[out]++;
                if(freq[out] > 0){
                    required++;
                }
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start, start + minLen);
    }
}