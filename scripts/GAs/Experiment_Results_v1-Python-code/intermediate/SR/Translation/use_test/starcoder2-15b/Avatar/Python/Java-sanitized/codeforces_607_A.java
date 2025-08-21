class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int n = s.length();
        int res = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = Math.max(start, last[s.charAt(i)] + 1);
            res = Math.max(res, i - start + 1);
            last[s.charAt(i)] = i;
        }
        return res;
    }
}