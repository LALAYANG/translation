class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n * k == 0) {
            return 0;
        }
        Map<Character, Integer> count = new HashMap<>();
        int left = 0;
        int right = 0;
        int ans = 1;
        while (right < n) {
            char ch = s.charAt(right);
            count.put(ch, count.getOrDefault(ch, 0) + 1);
            while (count.size() > k) {
                char ch2 = s.charAt(left);
                count.put(ch2, count.get(ch2) - 1);
                if (count.get(ch2) == 0) {
                    count.remove(ch2);
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}