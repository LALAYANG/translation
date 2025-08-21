

```java

```
/src/main/java/com/leetcode/problems/medium/LongestPalindromicSubstring.java
package com.leetcode.problems.medium;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left;
        int R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("babad"));
        System.out.println(tring.longestPalindrome("cbbd"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("a"));
        System.out.println(longestPalindromicSubstring.longestPalindrome("ac"));
    }
}
longestPalindromicSubstring.longestPalindrome("abba"));
        System.out.println(longestPalindromicSubs/src/main/java/com/leetcode/problems/medium/FindAllAnagramsInAString.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return result;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int count = map.size();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            right++;
            while (count == 0) {
                char temp = s.charAt(left);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) {
                        count++;
                    }
                }
                if (right - left == p.length()) {
                    result.add(left);
                }
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();
        System.out.println(findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAllAnagramsInAString.findAnagrams("abab", "ab"));
    }
}
/src/main/java/com/leetcode/problems/medium/FindAllDuplicatesInAnArray.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
            }
}
      result.add(index + 1);
            }
            nums[index] = -nums[index];
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray findAllDuplicatesInAnArray = new FindAllDuplicatesInAnArray();
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(new int[]{1, 1, 2}));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(new int[]{1}));
        System.out.println(findAllDuplicatesInAnArray.findDuplicates(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
  /src/main/java/com/leetcode/problems/medium/FindTheDuplicateNumber.java
package com.leetcode.problems.medium;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        fast = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber findTheDuplicateNumber = new FindTheDuplicateNumber();
        System.out.println(findTheDuplicateNumber.findDuplicate(new int[]{1, 3, 4, 2, 2}));
        System.out.println(findTheDuplicateNumber.findDuplicate(new int[]{3, 1, 3, 4, 2}));
    }
}
/src/main/java/com/leetcode/problems/medium/FindAllNumbersDisappearedInAnArray.java
package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        System.out.println(findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
        System.out.println(findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{1}));
        System.out.println(findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
    }
}
  }
        return result;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{0}));
        System.out.println(longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 4}));
    }
}
/src/main/java/com/leetcode/problems/medium/LongestIncreasingSubsequence.java
package com.leetcode.problems.medium;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public int lengthOfLIS3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public int lengthOfLIS4(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
      /src/main/java/com/leetcode/problems/medium/MinimumWindowSubstring.java
package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s == null || s.length() == 0 || t == null || t.length() == 0) {
            return "";
        }
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int right = 0;
        int count = map.size();
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    count--;
                }
            }
            right++;
            while (count == 0) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                char temp = s.charAt(left);
                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                    if (map.get(temp) > 0) {
                        ctWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minimumWindowSubstring.minWindow("a", "a"));
        System.out.println(minimumWindowSubstring.minWindow("a", "aa"));
    }
}
ount++;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        System.out.println(minimumWindowSubstring.minWindow("a", "a"));
        System.out.println(minimumWindowSubstring.minWindow("aa", "aa"));
        System.out.
