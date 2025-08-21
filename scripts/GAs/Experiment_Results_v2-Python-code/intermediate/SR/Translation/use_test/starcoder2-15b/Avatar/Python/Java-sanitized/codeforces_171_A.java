public class codeforces_171_A {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int[] count = new int[256];
        int i = 0, j = 0, maxLen = 0, distinct = 0;
        while (j < s.length()) {
            if (count[