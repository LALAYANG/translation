class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
            while (start < i && count[c] > 1) {
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }