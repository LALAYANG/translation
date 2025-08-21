public class codeforces_379_A {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            end++;
            while (map.size() > 2) {
                char c1 = s.charAt(start);
                if (map.get(c1) == 1) {
                    map.remove(c1);
                } else {
                    map.put(c1, map.get(c1) - 1);
                }
                start++;
            }
            max = Math.max(max, end - start);
        }
        return max;
    }
}