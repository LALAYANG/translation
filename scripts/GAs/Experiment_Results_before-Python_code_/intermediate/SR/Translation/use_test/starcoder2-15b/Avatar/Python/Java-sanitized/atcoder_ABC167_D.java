class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) return 0;
        // sliding window left and right pointers
        int left = 0;
        int right = 0;
        // hashmap character -> its rightmost position 
        // in the sliding window
        Map<Character, Integer> hashmap = new HashMap<Character, Integer>();

        int max_len = 1;

        while (right < n) {
            // slidewindow contains less than k characters
            if (hashmap.size() <= k) {
                char c = s.charAt(right);
                hashmap.put(c, right);
                right++;
            }
            // slidewindow contains more than k characters
            if (hashmap.size() > k) {
                // delete the leftmost character
                int leftmost = n;
                for (int i : hashmap.values()) {
                    leftmost = Math.min(leftmost, i);
                }
                char c = s.charAt(leftmost);
                hashmap.remove(c);
                left = leftmost + 1;
            }

            max_len = Math.max(max_len, right - left);
        }
        return max_len;
    }
}