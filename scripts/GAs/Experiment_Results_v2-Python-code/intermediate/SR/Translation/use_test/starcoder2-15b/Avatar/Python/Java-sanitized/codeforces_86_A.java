public class codeforces_86_A {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (j < n) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            while (map.size() > k) {
                char d = s.charAt(i);
                map.put(d, map.get(d) - 1);
                if (map.get(d) == 0) {
                    map.remove(d);
                }
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}