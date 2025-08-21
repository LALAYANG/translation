public class codeforces_622_A {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int length = s.length();
        if (length * k == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] charIndex = new int[256];
        int distinct = 0;
        for (int i = 0, j = 0; i < length; i++) {
            if (charIndex[s.charAt(i)] == 0) {
                distinct++;
            }
            charIndex[s.charAt(