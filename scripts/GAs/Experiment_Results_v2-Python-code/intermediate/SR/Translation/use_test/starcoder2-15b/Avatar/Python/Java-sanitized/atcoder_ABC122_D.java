class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            }
        }
        return maxLen;
    }
}