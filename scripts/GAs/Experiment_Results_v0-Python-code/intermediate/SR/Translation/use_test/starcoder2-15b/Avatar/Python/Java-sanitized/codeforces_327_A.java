class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int[] map = new int[256];
        int start = 0, end = 0, max = 0, counter = 0;
        while (end < s.length()) {
            if (map[s.charAt(end)] == 0) {
                counter++;
            }
            map[s.charAt(end)]++;
            end++;
            while (counter > k) {
                map[s.charAt(start)]--;
                if (map[s.charAt(start)] == 0) {
                    counter--;
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}