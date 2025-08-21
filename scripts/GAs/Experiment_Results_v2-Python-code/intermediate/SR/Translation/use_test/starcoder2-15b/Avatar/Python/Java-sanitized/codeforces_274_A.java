public class codeforces_274_A {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0) {
            return 0;
        }
        int[] count = new int[256];
        int num = 0;
        int start = 0;
        int max_length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 0) {
                num++;
            }
            count[s.charAt(i)]++;
            while (num > k) {
                count[s.charAt(start)]--;