public class codeforces_272_B {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }
        int start = 0;
        int end = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            if