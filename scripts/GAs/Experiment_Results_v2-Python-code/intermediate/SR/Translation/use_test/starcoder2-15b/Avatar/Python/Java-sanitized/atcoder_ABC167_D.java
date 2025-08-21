class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);
        int start = 0;
        int max = 0;
        for